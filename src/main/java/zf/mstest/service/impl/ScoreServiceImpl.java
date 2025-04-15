// zf/mstest/service/impl/ScoreServiceImpl.java
package zf.mstest.service.impl;

import zf.mstest.entity.dto.PersonalScoreDTO;
import zf.mstest.entity.dto.TeamScoreDTO;
import zf.mstest.entity.PersonalScore;
import zf.mstest.entity.TeamScore;
import zf.mstest.mapper.PersonalScoreMapper;
import zf.mstest.mapper.TeamScoreMapper;
import zf.mstest.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 成绩查询服务实现类
 * 实现ScoreService接口定义的方法
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    private final PersonalScoreMapper personalScoreMapper;
    private final TeamScoreMapper teamScoreMapper;

    /**
     * 构造器注入Mapper依赖
     * @param personalScoreMapper 个人成绩Mapper
     * @param teamScoreMapper 团队成绩Mapper
     */
    @Autowired
    public ScoreServiceImpl(PersonalScoreMapper personalScoreMapper,
                            TeamScoreMapper teamScoreMapper) {
        this.personalScoreMapper = personalScoreMapper;
        this.teamScoreMapper = teamScoreMapper;
    }

    /**
     * 获取个人成绩实现
     * @param group 组别标识（A/B）
     * @return 个人成绩DTO列表
     */
    @Override
    @Transactional(readOnly = true)
    public List<PersonalScoreDTO> getPersonalScores(String group) {
        // 1. 查询数据库获取原始数据
        List<PersonalScore> scores = personalScoreMapper.findByGroup(group);
        System.out.println(scores);
        // 2. 转换为DTO对象
        return scores.stream()
                .map(this::convertToPersonalDTO)
                .collect(Collectors.toList());
    }

    /**
     * 获取团队成绩实现
     * @param group 组别标识（A/B）
     * @return 团队成绩DTO列表
     */
    @Override
    @Transactional(readOnly = true)
    public List<TeamScoreDTO> getTeamScores(String group) {
        // 1. 查询数据库获取原始数据
        List<TeamScore> scores = teamScoreMapper.findTeamByGroup(group);

        // 2. 转换为DTO对象
        return scores.stream()
                .map(this::convertToTeamDTO)
                .collect(Collectors.toList());
    }

    /**
     * 将PersonalScore实体转换为PersonalScoreDTO
     * @param entity 数据库实体
     * @return DTO对象
     */
    private PersonalScoreDTO convertToPersonalDTO(PersonalScore entity) {
        PersonalScoreDTO dto = new PersonalScoreDTO();
        dto.setRanking(entity.getRanking());
        dto.setName(entity.getName());
        dto.setUnit(entity.getRepresentativeUnit());
        dto.setRegistrationNumber(entity.getRegistrationNumber());
        dto.setProjectCode(entity.getProjectCode());
        dto.setMedal(entity.getMedal());
        return dto;
    }

    /**
     * 将TeamScore实体转换为TeamScoreDTO
     * @param entity 数据库实体
     * @return DTO对象
     */
    private TeamScoreDTO convertToTeamDTO(TeamScore entity) {
        TeamScoreDTO dto = new TeamScoreDTO();
        dto.setRanking(entity.getRanking());
        dto.setTeamName(entity.getTeamName());
        dto.setUnit(entity.getRepresentativeUnit());
        dto.setTeamNumber(entity.getTeamNumber());
        dto.setProjectCode(entity.getProjectCode());
        dto.setMedal(entity.getMedal());
        return dto;
    }
}
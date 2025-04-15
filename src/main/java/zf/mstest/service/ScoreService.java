package zf.mstest.service;

import zf.mstest.entity.dto.PersonalScoreDTO;
import zf.mstest.entity.dto.TeamScoreDTO;
import java.util.List;

/**
 * 成绩查询服务接口
 * 定义业务逻辑方法
 */
public interface ScoreService {
    /**
     * 获取个人成绩列表
     * @param group 组别名称
     * @return 个人成绩DTO列表
     */
    List<PersonalScoreDTO> getPersonalScores(String group);

    /**
     * 获取团队成绩列表
     * @param group 组别名称
     * @return 团队成绩DTO列表
     */
    List<TeamScoreDTO> getTeamScores(String group);
}
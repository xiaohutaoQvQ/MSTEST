package zf.mstest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zf.mstest.entity.TeamScore;

import java.util.List;

@Mapper
public interface TeamScoreMapper {
    List<TeamScore> findTeamByGroup(String group);
}

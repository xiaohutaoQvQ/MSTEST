package zf.mstest.mapper;

import zf.mstest.entity.PersonalScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * 个人成绩数据访问接口
 * 使用MyBatis注解方式实现SQL映射
 */
@Mapper
public interface PersonalScoreMapper {
    /**
     * 根据组别查询个人成绩
     * @param group 组别名称（A组/B组）
     * @return 按排名升序排列的成绩列表
     */
    List<PersonalScore> findByGroup(String group);
}
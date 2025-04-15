package zf.mstest.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 团队成绩数据传输对象
 * 继承基础DTO并扩展团队特有字段
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamScoreDTO extends ScoreDTO {

    /**
     * 团队名称（覆盖父类name字段）
     * 示例值："先锋队"、"创新团"
     */
    private String teamName;

    /**
     * 团队唯一编号
     * 格式示例："T2023001"
     */
    private String teamNumber;

    /**
     * 重写父类getName方法
     * @return 团队名称
     */
    @Override
    public String getName() {
        return this.teamName;
    }

    /**
     * 重写父类getNumber方法
     * @return 团队编号
     */
    @Override
    public String getNumber() {
        return this.teamNumber;
    }
}
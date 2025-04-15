package zf.mstest.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 个人成绩数据传输对象
 * 继承基础DTO并扩展个人特有字段
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PersonalScoreDTO extends ScoreDTO {

    /**
     * 个人注册编号（覆盖父类number字段）
     * 格式示例："P2023001"
     */
    private String registrationNumber;

    /**
     * 重写父类getName方法
     * @return 参赛者姓名（直接返回父类name字段）
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * 重写父类getNumber方法
     * @return 个人注册编号
     */
    @Override
    public String getNumber() {
        return this.registrationNumber;
    }
}
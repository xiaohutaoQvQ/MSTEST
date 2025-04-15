package zf.mstest.entity.dto;

import lombok.Data;

/**
 * 成绩基础数据传输对象
 * 包含所有成绩类型的公共字段
 */
@Data
public class ScoreDTO {
    /**
     * 官方排名（从1开始）
     * 示例：1（冠军）、2（亚军）
     */
    private Integer ranking;

    /**
     * 名称字段（需被子类覆盖）
     * 个人成绩：参赛者姓名
     * 团队成绩：团队名称
     */
    protected String name;

    /**
     * 代表单位
     * 示例："北京大学"
     */
    private String unit;

    /**
     * 编号字段（需被子类覆盖）
     * 个人成绩：注册编号
     * 团队成绩：团队编号
     */
    protected String number;

    /**
     * 项目编码
     * 格式示例："PROJ2023"
     */
    private String projectCode;

    /**
     * 奖牌类型
     * 可选值："金牌"、"银牌"、"铜牌"、"无"
     */
    private String medal;


    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
}
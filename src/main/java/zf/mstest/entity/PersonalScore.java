package zf.mstest.entity;

import jakarta.persistence.*;


/**
 * 个人成绩实体类
 * 对应数据库表 personal_score
 */
@Entity
@Table(name = "personal_score")
public class PersonalScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 主键ID
    private String groupName; // 所属组别名称
    private String name; // 参赛者姓名
    private String representativeUnit; // 代表单位
    private String registrationNumber; // 注册编号
    private String projectCode; // 项目编码
    private Integer ranking; // 官方排名
    private String medal; // 奖牌类型（金牌/银牌/铜牌）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepresentativeUnit() {
        return representativeUnit;
    }

    public void setRepresentativeUnit(String representativeUnit) {
        this.representativeUnit = representativeUnit;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
}

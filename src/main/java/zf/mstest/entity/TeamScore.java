package zf.mstest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team_score")
public class TeamScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName; // 所属组别名称
    private String teamName; // 参赛者姓名
    private String representativeUnit; // 代表单位
    private String teamNumber;
    private String projectCode;
    private Integer ranking;
    private String medal;

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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRepresentativeUnit() {
        return representativeUnit;
    }

    public void setRepresentativeUnit(String representativeUnit) {
        this.representativeUnit = representativeUnit;
    }

    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
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
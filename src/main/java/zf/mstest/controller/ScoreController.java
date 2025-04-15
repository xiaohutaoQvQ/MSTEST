package zf.mstest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zf.mstest.entity.dto.PersonalScoreDTO;
import zf.mstest.entity.dto.TeamScoreDTO;
import zf.mstest.service.ScoreService;
import java.util.List;

/**
 * 成绩查询API控制器
 * 提供个人和团队成绩的RESTful接口
 */
@RestController
@RequestMapping("/api/scores")
@CrossOrigin(origins = "*")
public class ScoreController {

    private final ScoreService scoreService;

    /**
     * 构造器注入服务依赖
     * @param scoreService 成绩查询服务
     */
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    /**
     * 获取个人成绩API
     * @param group 路径参数-组别标识（A/B）
     * @return 包含个人成绩列表的响应实体
     *
     * 示例请求：
     * GET /api/scores/personal/A
     */
    @GetMapping("/personal/{group}")
    public ResponseEntity<List<PersonalScoreDTO>> getPersonalScores(
            @PathVariable("group") String group) {
        List<PersonalScoreDTO> data = scoreService.getPersonalScores(group);
        return ResponseEntity.ok(data);
    }

    /**
     * 获取团队成绩API
     * @param group 路径参数-组别标识（A/B）
     * @return 包含团队成绩列表的响应实体
     *
     * 示例请求：
     * GET /api/scores/team/B
     */
    @GetMapping("/team/{group}")
    public ResponseEntity<List<TeamScoreDTO>> getTeamScores(
            @PathVariable("group") String group) {
        List<TeamScoreDTO> data = scoreService.getTeamScores(group);
        return ResponseEntity.ok(data);
    }

    /**
     * 全局异常处理（简化示例）
     * 实际开发建议使用@ControllerAdvice
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.internalServerError()
                .body("服务异常: " + e.getMessage());
    }
}
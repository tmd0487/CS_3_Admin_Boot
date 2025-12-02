package admin.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/report")
@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/boardList")
    public ResponseEntity<List<BoardDTO>> boardList() {
        return ResponseEntity.ok(reportService.boardList());
    }

    @GetMapping("/boardDetail")
    public ResponseEntity<List<ReportDTO>> boardDetail(@RequestParam("board_seq") int boardSeq) {
        return ResponseEntity.ok(reportService.boardDetail(boardSeq));
    }

    @GetMapping("/commentList")
    public ResponseEntity<List<CommentDTO>> commentList() {
        return ResponseEntity.ok(reportService.commentList());
    }

    @GetMapping("/commentDetail")
    public ResponseEntity<List<ReportDTO>> commentDetail(@RequestParam("comment_seq") int comment_seq) {
        return ResponseEntity.ok(reportService.commentDetail(comment_seq));
    }
}

package admin.report;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private ReportDAO dao;

    public List<BoardDTO> boardList() {
        return dao.boardList();
    }

    public List<ReportDTO> boardDetail(int board_seq) {
        return dao.boardDetail(board_seq);
    }

    public List<CommentDTO> commentList() {
        return dao.commentList();
    }

    public List<ReportDTO> commentDetail(int comment_seq) {
        return dao.commentDetail(comment_seq);
    }
}

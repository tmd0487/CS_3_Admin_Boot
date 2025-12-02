package admin.report;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReportDTO {
    private int report_seq; //고유시퀀스
    private String user_id; //신고당한놈
    private int board_seq;  // 게시판 고유시퀀스
    private int comment_seq; // 커멘드 시퀀스 
    private String report_type; // 신고사유
    
}
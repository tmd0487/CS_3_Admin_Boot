package admin.report;


import java.sql.Timestamp;

import com.google.auto.value.AutoValue.Builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDTO {

    private int board_seq;
    private String board_type;
    private String user_id;
    private String title;
    private String content;
    private int is_reported;
    private boolean is_privated;
    private int view_count;
    private Timestamp created_at;
}
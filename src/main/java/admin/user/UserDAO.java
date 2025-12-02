package admin.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    private SqlSession mybatis;

    public List<UserDTO> userList(){
        return mybatis.selectList("user.userList");
    }

    public int secessionUser(UserDTO dto){
        return mybatis.delete("user.secessionUser", dto);
    }
}

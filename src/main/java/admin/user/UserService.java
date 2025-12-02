package admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO dao;

    public List<UserDTO> userList(){
        return dao.userList();
    }

    public int secessionUser(UserDTO dto){
        return dao.secessionUser(dto);
    }
}

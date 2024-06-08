package  com.bookmanagement.OnlineBookManagement.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.bookmanagement.OnlineBookManagement.Repository.UserRepository;
import com.bookmanagement.OnlineBookManagement.Users.User;

@Service
public class UserService {

  UserRepository repo;

  public UserService(UserRepository repo) {
    this.repo = repo;
  }

  public List<User> getUsers(){
    return repo.findAll();
  }

  public void createUser(User user){
    repo.save(user);
  }

}

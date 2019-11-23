import com.bea.dao.UserDao;
import com.bea.model.User;
import org.junit.Test;

import java.util.List;

/**
 * Created by fandi on 2019/11/17 0017.
 */
public class UserTest {

    @Test
    public void getUsers() throws Exception {
        UserDao dao = new UserDao();
        List<User> users = dao.getUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }
}

package tr.gov.gib.sf900jdbctemp.service;
import tr.gov.gib.sf900jdbctemp.dao.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    User createUser(User user);
    Optional<User> getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    User updateUser(User user);
}
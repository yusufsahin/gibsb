package tr.gov.gib.sf900jdbctemp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.gov.gib.sf900jdbctemp.dao.UserRepository;
import tr.gov.gib.sf900jdbctemp.dao.impl.UserRepositoryImpl;
import tr.gov.gib.sf900jdbctemp.dao.model.User;
import tr.gov.gib.sf900jdbctemp.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User updateUser(User user) {
        if(userRepository.findById(user.getId()).isPresent()) {
            userRepository.update(user);
            return user;
        } else {
            // İstediğiniz bir hata yönetimi ekleyebilirsiniz. Örnek olarak, kullanıcı bulunamadı hatası dönülebilir.
            throw new RuntimeException("User not found with id: " + user.getId());
        }
    }
}

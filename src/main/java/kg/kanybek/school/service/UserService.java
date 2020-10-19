package kg.kanybek.school.service;

import kg.kanybek.school.entity.User;
import kg.kanybek.school.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User findByUserName(String username) {
        return repository.findByUsername(username);
    }
}

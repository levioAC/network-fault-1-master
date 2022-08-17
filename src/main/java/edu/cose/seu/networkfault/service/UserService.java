package edu.cose.seu.networkfault.service;

import edu.cose.seu.networkfault.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String login(User user);
}

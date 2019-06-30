package com.mchne.core.common;


import com.mchne.core.data.persistence.entity.User;
import com.mchne.core.data.persistence.repository.UserRepository;
import com.mchne.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        return userRepository.findAll();
    }

}

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

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User persistUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user){
        userRepository.delete(user);
    }

    @Override
    public void upDateUser(User user){
        userRepository.save(user);
    }

}

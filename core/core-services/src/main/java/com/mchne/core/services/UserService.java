package com.mchne.core.services;

import org.springframework.stereotype.Service;
import com.mchne.core.data.persistence.entity.User;


import java.util.List;

@Service
public interface UserService {

    List<User> list();

}

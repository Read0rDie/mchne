package com.mchne.core.rest;

import com.mchne.core.data.persistence.entity.User;
import com.mchne.core.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/MchneCoreWeb/rest/users")
public class UserRS {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> index() {
        return userService.list();
    }
}

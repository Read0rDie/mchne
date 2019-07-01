package com.mchne.core.rest;

import com.mchne.core.common.utils.CommonUtils;
import com.mchne.core.data.persistence.entity.User;
import com.mchne.core.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/MchneCoreWeb/rest/users")
public class UserRS {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public List<User> index() {
        return userService.list();
    }

    @ApiOperation(value = "Creates a new person.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = User.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public User index(@PathVariable Integer id) {
        return userService.getUser(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create( @RequestBody User user) {
        User persistedUser = userService.persistUser(user);
        return persistedUser;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public User edit(@PathVariable Integer id, @RequestBody User user) {
        User updatedUser;
        try {
            updatedUser = userService.getUser(id);
        } catch (Exception e){
            throw new IllegalStateException("Error occurred when retrieving user from database.");
        }

        if(!CommonUtils.isSet(updatedUser)){
            throw new IllegalStateException("User not found in database");
        }
        updatedUser.setUserName(user.getUserName());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());

        User persistedUser;
        try{
            persistedUser = userService.persistUser(updatedUser);
        } catch(Exception e){
            throw new IllegalStateException("Error occurred when persisting user edits to database.");
        }
        return persistedUser;
    }
}

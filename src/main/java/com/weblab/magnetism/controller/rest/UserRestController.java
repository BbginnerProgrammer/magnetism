package com.weblab.magnetism.controller.rest;

import com.weblab.magnetism.model.User;
import com.weblab.magnetism.service.interf.CRUDService;
import com.weblab.magnetism.service.interf.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserRestController.USER_REST_URL)
public class UserRestController extends CRUDRestController<User, Long> {

    public final static String USER_REST_URL = "user";

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @Override
    CRUDService<User, Long> getService() {
        return userService;
    }
}

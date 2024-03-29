package com.simpleProjec.Simple_Project.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "Simple root";
    }

    @PostMapping("/saveUser")
    public String saveUser() {
        return "User saved!";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "User Updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser()
    {
        return " User Deleted!";
    }

}



package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/submitform")
    public String submitform(Model model) {
        UserForm userForm = new UserForm();
        User stefan = new User("Tim", 20);
        User lisa = new User("Alexandra", 33);
        User quinn = new User("Moritz", 16);
        List<User> userList = new ArrayList<>();
        userList.add(stefan);
        userList.add(lisa);
        userList.add(quinn);
        userForm.setUserList(userList);

        model.addAttribute("userForm", userForm);
        return "submitform.html";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addItem(UserForm userForm) {
        if (userForm.getUserList() == null) {
            System.out.println("Liste ist leer");
        } else {
            userForm.getUserList().forEach(user -> {
                System.out.println("User: " + user.getName() + " Alter: " + user.getAge());
            });
        }
        // process Objects
        return "redirect:/";
    }

}

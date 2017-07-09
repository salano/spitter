/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.controller;

import gy.salano.springweb.libs.SpitterForm;
import java.io.IOException;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author salano
 */
@Controller
@RequestMapping({"/login"})
public class LoginController {
    @RequestMapping(method = GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/login", method = POST)
    public String processLogin() throws IOException {
        
        return "redirect:/home";
    }
}

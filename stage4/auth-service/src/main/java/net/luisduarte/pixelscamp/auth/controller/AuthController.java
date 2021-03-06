package net.luisduarte.pixelscamp.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class AuthController {

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView login() {
    return new ModelAndView("login");
  }
}
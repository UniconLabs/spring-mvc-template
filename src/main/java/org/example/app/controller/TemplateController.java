package org.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Template Controller
 */
@Controller
@RequestMapping("/")
public class TemplateController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}

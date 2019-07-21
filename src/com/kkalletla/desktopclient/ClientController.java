package com.kkalletla.desktopclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import java.io.IOException;

@Controller
public class ClientController {

    @RequestMapping("execute")
    public String compute(@RequestParam("command") String command){

        try {
            Process process = Runtime.getRuntime().exec(command);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

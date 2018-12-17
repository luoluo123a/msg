package com.baizhi.lpm.controller;

import com.baizhi.lpm.entity.Msg;
import com.baizhi.lpm.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @RequestMapping("queryAll")
    public String queryAll(HttpSession session) {
        List<Msg> list = msgService.queryAll();

        System.out.println("aaaaaaaaaaaaaa");
        session.setAttribute("msg", list);


        return "index";
    }
}

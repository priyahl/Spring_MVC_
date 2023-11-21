package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.AddService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class addController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response) {
//     int i=Integer.parseInt(request.getParameter("t1"));
//     int j=Integer.parseInt(request.getParameter("t2"));

     AddService a=new AddService();
     int k=a.add(i, j);
     ModelAndView mv=new ModelAndView();
     mv.setViewName("display");
     mv.addObject("result",k);
     
     return mv;

	}
}

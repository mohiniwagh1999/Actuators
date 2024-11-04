package com.act.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

	@GetMapping("/msg")
	@ResponseBody
	public String getMsg()
	{
		return "welcome to ashok it";
	}
}

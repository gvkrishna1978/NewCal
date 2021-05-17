package com.example.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class MyCustomErrorController implements ErrorController {
	
	//@RequestMapping("/error")
	public @ResponseBody String handleProblem(HttpServletRequest req) {
		
		int code = (Integer)req.getAttribute("javax.servelet.error.status_code");
		
		Exception exception = (Exception) req.getAttribute("javax.servelet.error.exception");
		
		StringBuilder builder =  new StringBuilder();
		builder.append("<html><body>");
		builder.append("<H1>ERROR DETAILS</H1>");
		builder.append("<P>Status Code : ").append(code).append("</P>");
		builder.append("<P>Exception : ").append(exception==null?"NONE":exception.getMessage()).append("</P>");
		builder.append("</html></body>");
		
		
		return builder.toString();
	}

	@Override
	public String getErrorPath() {
		
		return "/error";
	}

}

package com.webapp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping(path = "/msg")
	public String getMessage() {
		return "hello world";
	}

	@RequestMapping(path = "/getName/{name}")
	public String getName() {
		return "Lokesh";
	}

	@GetMapping(path = "/getAge/{year}")
	public int getAge(@PathVariable("year") int y) {
		return 2023 - 8;
	}

	@RequestMapping(value = "/getOdd/{num}")
	public String getOdd(@PathVariable("num") int z) {
		if (z % 2 == 0) {
			return "Even";
		} else {
			return "odd";
		}
	}

	@GetMapping(path = "/getAdd/{a}/{b}")
	public int getAdd(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(path = "/check")
	public String check(@RequestParam("username") String name, @RequestParam("passWord") String pass) {
		if (name.equalsIgnoreCase("suresh") && pass.equals("1234")) {
			return "Authorized person";
		} else {
			return "UnAuthorized person";

		}
	}

	@GetMapping(path = "/getPen")
	public Pen getPen(@RequestBody Pen pen) {
		return pen;
	}

	@GetMapping(path = "/getPens")
	public List<Pen> getPens(@RequestBody List<Pen> pens) {
		return pens;

}
}
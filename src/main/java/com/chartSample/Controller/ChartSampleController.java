package com.chartSample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartSampleController {

	@RequestMapping(value="/")
	public String index(Model model) {
		return "index";
	}
}

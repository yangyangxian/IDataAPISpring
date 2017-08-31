package com.yang.APIController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/API")
public class GDPController extends APIBaseController {
	
    @GetMapping("/GDP")
    @ResponseBody
    public String getGDP() {
        return "mapping url is /API/GDP";
    }
}

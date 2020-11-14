package com.coding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class controller {

	Logger logger = LoggerFactory.getLogger(controller.class);

    @GetMapping("/hello")
    public String hello()
    {
        logger.trace("FATAL ERROR");
        logger.info("msg info");
        logger.debug("debug msg");
        logger.warn("msg warn");
        return "Hello Daily Code Buffer!!";
    }
}

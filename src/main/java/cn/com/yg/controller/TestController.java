package cn.com.yg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "", description = "")
@RequestMapping("/abc")
public class TestController {

    @RequestMapping(value = "/lin", method = RequestMethod.GET)
    @ApiOperation(value = "111")
    @ResponseBody
    public String getTestMsg() {
        return "你好啊！我启动了";
    }
}

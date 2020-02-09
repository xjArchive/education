package com.education.open.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: LoginController
 * Description:
 * date: 2019/12/27 10:59
 *
 * @author xujin <br/>
 * @since JDK 1.8
 */
@RestController
@Api(value = "API - USER", description = "用户登陆服务")
@RequestMapping("/login")
public class LoginController {
    @GetMapping("checkSaUserMobile")
    @CrossOrigin(origins = "*", maxAge = 3600)
    @ApiOperation("ddddd")
    public void checkSaUserMobile(@ApiParam(value="手机号")@RequestParam("mobile") String mobile) {
    }
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import ${package}.api.common.BaseResult;
import ${package}.core.entity.User;
import ${package}.core.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chea0515@163.com
 */
@RestController
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Resource
    private IUserService userService;

    @GetMapping
    public BaseResult<List<User>> indexPage() {
        LOGGER.info("index 页面请求");
        List<User> userList = userService.list();
        return BaseResult.result(userList);
    }
}

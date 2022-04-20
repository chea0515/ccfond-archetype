#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${package}.core.dao.UserMapper;
import ${package}.core.entity.User;
import ${package}.core.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author chea0515@163.com
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

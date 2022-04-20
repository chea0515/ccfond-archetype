#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${package}.core.entity.User;

/**
 * @author chea0515@163.com
 */

public interface UserMapper extends BaseMapper<User> {
}

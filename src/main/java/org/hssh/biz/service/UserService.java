package org.hssh.biz.service;

import org.hssh.biz.entity.User;
import org.hssh.biz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hssh on 2017/4/23.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

}

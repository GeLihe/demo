package com.gelihe.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.gelihe.dao.bean.User;
import com.gelihe.dao.bean.UserExample;
import com.gelihe.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    UserMapper userMapper;

    public boolean register(User user){
        UserExample example = new UserExample();
        example.createCriteria().andUserEmailEqualTo(user.getUserEmail());
        if(CollectionUtil.isNotEmpty(userMapper.selectByExample(example))){
            return false;
        }
        if(StrUtil.isBlank(user.getUserId())){
            user.setUserId(IdUtil.simpleUUID());
        }
        userMapper.insert(user);
        return true;
    }

}

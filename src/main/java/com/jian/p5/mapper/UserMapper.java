package com.jian.p5.mapper;

import com.jian.p5.pojo.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public List<UserVO> query();

}

package com.MyBatis.mapperInt;

import com.MyBatis.Users.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsermapperInt {
    // 根据ID查询信息
    User selectUser(int id) throws Exception;

    //模糊查询
    List<User> selectUserByMoHu(String name)throws Exception;//方法的返回值类型应该为一个列表

    // 添加信息
    void insertUser(User user) throws Exception;

    // 删除信息
    void deleteUser(int id) throws Exception;

    //更新信息
    void update(@Param("id") int id, @Param("username") String username, @Param("userage") int userage);
}

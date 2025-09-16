package com.zredtea.test;

import com.zredtea.dao.UserDao;
import com.zredtea.entity.User;
import com.zredtea.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = DBUtil.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User userGet = userDao.searchUserByUserid(4000L);
        System.out.println(userGet);

        User userTest = new User(4000L,"yredtea","Sakura");
        System.out.println(userTest);
        userDao.newUser(userTest);

        User user2 = userDao.searchUserByUserid(4000L);
        System.out.println(user2);
    }
}

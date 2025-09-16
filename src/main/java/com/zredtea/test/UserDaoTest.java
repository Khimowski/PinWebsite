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
        User user = userDao.searchUserByUserid(2655548416L);
        System.out.println(user);

        User user2 = new User(114514L,"ysxb","yeshou","1919810");
        System.out.println(user2);
    }
}

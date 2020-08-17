package cn.itkuaixue;

import cn.itkuaixue.dao.LinkmanDao;
import cn.itkuaixue.pojo.Linkman;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:libingcheng
 * @Data:2020/8/17 3:09 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-mybatis.xml")
public class TestSSM {
    @Autowired
    public LinkmanDao linkmanDao;
    @Test
    public void test01(){
        List<Linkman> linkmanList = linkmanDao.findAll();
        System.out.println(linkmanList);
    }
}

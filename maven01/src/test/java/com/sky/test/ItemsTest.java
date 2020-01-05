package com.sky.test;

import com.sky.dao.ItemsDao;
import com.sky.domain.Items;
import com.sky.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取Spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //dao测试
        //从容器中拿到所需Dao的代理对象
//        ItemsDao bean = applicationContext.getBean(ItemsDao.class);
        //调用方法
//        Items item = bean.findById(1);
//        System.out.println(item.getName());

        //service测试
        ItemsService service = applicationContext.getBean(ItemsService.class);
        Items item = service.findById(2);
        System.out.println(item.getName());


    }
}

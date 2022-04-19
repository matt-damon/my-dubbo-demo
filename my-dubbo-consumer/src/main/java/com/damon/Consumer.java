package com.damon;

import com.damon.api.SiteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        //从IOC容器中获得SiteService服务提供者的代理对象
        SiteService siteService = (SiteService) context.getBean("siteService");
        String result = siteService.getName("dubbo");
        System.out.println(result);
    }
}

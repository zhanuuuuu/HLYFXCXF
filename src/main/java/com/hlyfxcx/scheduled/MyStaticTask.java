package com.hlyfxcx.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019-05-16.
 */
@Component
public class MyStaticTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //每隔2秒执行一次
    @Scheduled(fixedRate = 2000)
    public void testTasks() {
        System.out.println("当前时间：" + dateFormat.format(new Date()) +" 请不要关闭改dos框");
    }
}

package com.activemq.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liangliang on 2020/4/29 9:48
 */
@RestController
public class kafka {
    @Resource
    private KafkaTemplate<String, String>  kafkaTemplate;

    /**
     * 指定分区发送内容
     */
    @RequestMapping("/kafka")
    public String show(String text) {
//        String data = "{\"databases\":{\"3\":[{\"branch\":0,\"downSample\":0,\"key\":\"topic\",\"value\":\"yt\"}],\"5\":[{\"branch\":0,\"downSample\":3,\"key\":\"key\",\"value\":\"key1\"}]},\"collectorTargetCode\":\"33045mmyt\",\"sensorTargetCode\":\"oommyt\",\"sensorElementEname\":\"OO\",\"sensorProjectCode\":\"ceshi\",\"sensorPlaceFirmCode\":\"91320681322215290H\",\"branch\":0,\"downSample\":0,\"sampleTime\":1588098030000,\"receiveTime\":1588098030000,\"createTime\":0,\"value\":45.5,\"mpType\":\"Rtd\"}";
        kafkaTemplate.send("yt",2,null, text);
        return "发送成功---" + text;
    }

}

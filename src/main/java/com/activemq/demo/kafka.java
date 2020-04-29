package com.activemq.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * Created by liangliang on 2020/4/29 9:48
 */
@RestController
public class kafka {
    @Resource
    private KafkaTemplate<String, String>  kafkaTemplate;

    /**
     * 指定在1分区发送内容
     */
    @RequestMapping("/test")
    public String show() {
        String data = "{\"databases\":{\"3\":[{\"branch\":0,\"downSample\":0,\"key\":\"topic\",\"value\":\"yt\"}],\"5\":[{\"branch\":0,\"downSample\":3,\"key\":\"key\",\"value\":\"key1\"}]},\"collectorTargetCode\":\"33045mp666\",\"sensorTargetCode\":\"00004021895\",\"sensorElementEname\":\"CO\",\"sensorProjectCode\":\"ceshi\",\"sensorPlaceFirmCode\":\"91330400554775158L\",\"branch\":0,\"downSample\":0,\"sampleTime\":1588090830000,\"receiveTime\":1588090830000,\"createTime\":0,\"value\":53,\"mpType\":\"Rtd\"}\n";
        kafkaTemplate.send("yt","6", data);
        return "发送成功";
    }

}

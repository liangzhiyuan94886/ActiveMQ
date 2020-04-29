package com.activemq.demo;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.*;
import java.util.Scanner;

/**
 * Created by liangliang on 2020/3/10 19:04
 */
@Controller
public class ActiveMQ {
    @RequestMapping("/mq")
    public String sendMessage() {
        return "mq";
    }

//    public static void main(String[] args) {
    @RequestMapping("/send")
    @ResponseBody
    public String sendMessage(String topic,String text) {
//        Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
//        System.out.print("输入id字符串，多个用,分隔:");
//        String ids = input.next(); //输入字符串型
        Connection connection = null;
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://192.168.2.123:61616");//mq ip地址
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            //主题topic，可以替换
//            Destination destination = session.createTopic("330405.alarm.single.monitor");
            Destination destination = session.createTopic(topic);
            MessageProducer producer = session.createProducer(destination);
            sendMessage(session, producer,text);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (Throwable ignore) {
            }
        }
        return "执行完成";
    }

    public static void sendMessage(Session session, MessageProducer producer,String ids)
            throws Exception {
        TextMessage textMessage = session.createTextMessage();
        String [] allId = ids.split(",");
        for (String id : allId) {
            textMessage.setText(id);
            producer.send(textMessage);
        }
    }
}

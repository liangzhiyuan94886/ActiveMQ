package com.activemq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public Integer Main() {
        Scanner input=new Scanner(System.in);
        System.out.print("输入数字:");
        String str = input.next();
        int a = Integer.parseInt(str);
        int b = 2;
        if ( a > 0 ) {
            for (int i = 1; i < a; i ++) {
                b = b + 3;
            }
            int result = (2 + b) * a / 2;
            System.out.println(result);
            return 0;
        }else {
            return -1;
        }
    }

}

package com.small.tiger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author tiger
 */
@RestController
public class TestHello {

    @RequestMapping("/")
    public String helloDocker(){
        return "hello docker";
    }

    public static void main(String[] args) {
        int i = 5>>1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
    }
}

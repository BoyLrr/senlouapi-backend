package com.lee.senapiinterface;

import com.lee.senlouapiclientsdk.client.SenlouApiClient;
import com.lee.senlouapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SenapiInterfaceApplicationTests {

    @Resource
    private SenlouApiClient senlouApiClient;

    @Test
    void contextLoads() {
        String wodema = senlouApiClient.getNameByGet("wodema");
        User user = new User();
        user.setUsername("lalala");
        String usernameByPost = senlouApiClient.getUsernameByPost(user);
        System.out.println(wodema);
        System.out.println(usernameByPost);
    }

}

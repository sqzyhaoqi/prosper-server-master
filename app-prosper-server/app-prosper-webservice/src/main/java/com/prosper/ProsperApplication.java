package com.prosper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProsperApplication {

    public static void main(String[] args) {
        //BouncyCastle是一款开源的密码包，其中包含了大量的密码算法，使用BouncyCastle的目的就是为了扩充算法支持*****
        //必须放置于启动类主线程中
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        SpringApplication.run(ProsperApplication.class, args);
    }
}

package com.atstudy.gulimall.coupon;

import com.atstudy.common.utils.R;
import com.atstudy.gulimall.coupon.entity.CouponEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class GuliCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliCouponApplication.class, args);
    }

}

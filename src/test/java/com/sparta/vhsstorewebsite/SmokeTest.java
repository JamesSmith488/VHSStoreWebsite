package com.sparta.vhsstorewebsite;

import com.sparta.vhsstorewebsite.controllers.SiteController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private SiteController controller;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(controller).isNotNull();
    }
}

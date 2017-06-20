package com.gizwits;

import com.gizwits.web.Custom;
import com.gizwits.web.service.CustomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Custom.class)
public class TrainingTest {

    @Autowired
    CustomService customService;

    @Test
    public void test() {
        customService.show();
    }
}
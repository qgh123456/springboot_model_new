package com.atqgh.springboot;

import com.atqgh.springboot.common.constant.Constant;
import com.atqgh.springboot.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

//    @Autowired
//    SpringContextUtil springContextUtil;
    @Test
    public void contextLoads() {
        Constant constant = (Constant)SpringContextUtil.getBean("constant");

        System.out.println("1111111111111111");
    }

}

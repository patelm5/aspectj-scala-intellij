package com.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.component.SampleComponent;

@ContextConfiguration("classpath:spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class InterceptionTest {

    @Autowired
    private SampleComponent component ;

    @Test
    public void componentInterceptsWithoutException(){
              component.interceptMe("hello world");
    }

}

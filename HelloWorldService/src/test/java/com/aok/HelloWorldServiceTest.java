package com.aok;


import com.aok.com.aok.configuration.ServiceConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello World")
public class HelloWorldServiceTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testService() {
        Assert.assertThat(helloWorldService.getMessage(), is("Hello World"));
    }

    @SpringBootApplication
    @Import(ServiceConfiguration.class)
    static class  TestConfiguration {

    }

}

package com.standardset.camel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
@Component
public class Launcher {

    private final static Logger log = LoggerFactory.getLogger(Launcher.class);

    @Resource
    private RemoteService
        remoteServiceClient;

    public static void main(String[] args) {
        new GenericXmlApplicationContext(
            "classpath*:/spring/**/*.xml"
        )
        .getBean(
            Launcher.class
        )
        .run(args);
    }

    public void run(String[] args) {
        log.debug(
            remoteServiceClient.getText("Alex")
        );
    }
}

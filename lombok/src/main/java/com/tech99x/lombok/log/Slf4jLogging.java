package com.tech99x.lombok.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogging {
    private static final Logger log = LoggerFactory.getLogger(Slf4jLogging.class.getName());

    public static void main(String[] args) {
        log.debug("some debug details");
    }
}

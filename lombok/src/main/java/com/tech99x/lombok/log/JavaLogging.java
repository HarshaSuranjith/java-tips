package com.tech99x.lombok.log;


import java.util.logging.Logger;

public class JavaLogging {
    private static final Logger log = Logger.getLogger(JavaLogging.class.getName());

    public static void main(String[] args) {
        log.info("same old logging");
    }
}
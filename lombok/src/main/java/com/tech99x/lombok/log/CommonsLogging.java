package com.tech99x.lombok.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogging {
    private static final Log log = LogFactory.getLog(CommonsLogging.class);

    public static void main(String[] args) {
        log.fatal("something is not working");
    }
}

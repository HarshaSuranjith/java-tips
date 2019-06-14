package com.tech99x.lombok.log.lombok;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class CommonsLogging {
    public static void main(String[] args) {
        log.fatal("something not working");
    }
}

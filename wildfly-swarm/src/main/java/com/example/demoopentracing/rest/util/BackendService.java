package com.example.demoopentracing.rest.util;

import java.util.logging.Logger;

public class BackendService {
    private static final Integer SLEEP_INTERVAL = Integer.parseInt(System.getenv().getOrDefault("SLEEP_INTERVAL", "10"));
    public static Logger logger = Logger.getLogger(BackendService.class.getName());

    public void action() throws InterruptedException {
        anotherAction();
        Thread.sleep(SLEEP_INTERVAL);
    }

    private void anotherAction() {
        logger.fine("tracer.activeSpan returned null");
    }
}

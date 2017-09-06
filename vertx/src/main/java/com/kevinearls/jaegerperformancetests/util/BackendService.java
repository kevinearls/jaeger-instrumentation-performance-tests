package com.kevinearls.jaegerperformancetests.util;

import io.vertx.ext.web.RoutingContext;

import java.util.logging.Logger;

public class BackendService {
    private static final Integer SLEEP_INTERVAL = Integer.parseInt(System.getenv().getOrDefault("SLEEP_INTERVAL", "10"));
    public static Logger logger = Logger.getLogger(BackendService.class.getName());

    public void action(RoutingContext routingContext) throws InterruptedException {
        anotherAction();
        Thread.sleep(SLEEP_INTERVAL);
    }

    private void anotherAction() {
        logger.info("tracer.activeSpan returned null");
    }
}

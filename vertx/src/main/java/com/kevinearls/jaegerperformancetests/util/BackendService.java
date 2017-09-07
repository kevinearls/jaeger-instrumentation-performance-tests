package com.kevinearls.jaegerperformancetests.util;

import io.vertx.ext.web.RoutingContext;

import java.util.logging.Logger;

public class BackendService {
    public static Logger logger = Logger.getLogger(BackendService.class.getName());

    public void action(RoutingContext routingContext) throws InterruptedException {
        anotherAction();

    }

    private void anotherAction() {
        
    }
}

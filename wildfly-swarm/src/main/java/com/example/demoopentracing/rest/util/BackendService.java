package com.example.demoopentracing.rest.util;

import java.util.logging.Logger;

public class BackendService {
    public static Logger logger = Logger.getLogger(BackendService.class.getName());

    public void action() throws InterruptedException {
        anotherAction();
    }

    private void anotherAction() {

    }
}

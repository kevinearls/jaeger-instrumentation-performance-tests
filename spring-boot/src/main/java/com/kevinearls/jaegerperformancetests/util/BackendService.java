package com.kevinearls.jaegerperformancetests.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class BackendService {
    public static Logger logger = Logger.getLogger(BackendService.class.getName());

    public void action() throws InterruptedException {
        anotherAction();
    }

    private void anotherAction() {

    }
}

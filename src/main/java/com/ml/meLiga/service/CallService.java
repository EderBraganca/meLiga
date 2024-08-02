package com.ml.meLiga.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CallService {

    public void processCall(String message){
        log.info(message);
    }
}

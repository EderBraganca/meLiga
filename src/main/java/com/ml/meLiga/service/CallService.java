package com.ml.meLiga.service;

import com.ml.meLiga.domain.Call;
import com.ml.meLiga.repositories.CallRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CallService {
    @Autowired
    CallRepository callRepository;

    public void processCall(String message){
        log.info(message);
    }

    public Call createCall(String id){
        Call call = new Call();
        call.setId(id);
        call.setStatus("Started");
        callRepository.save(call);
        log.info("Call created");
        return call;
    }

    public Optional<Call> connectCall(String id){
        Call call = callRepository.findById(id).orElse(null);
        if(call != null){
            call.setStatus("Connected");
        }
        assert call != null;
        return Optional.of(call);
    }
}

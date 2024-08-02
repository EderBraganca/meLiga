package com.ml.meLiga.repositories;


import com.ml.meLiga.domain.Call;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CallRepository extends JpaRepository<Call, String>{
    Optional<Call> findCallById(String id);
    Optional<Call> getUserByCallId(String callId);
}

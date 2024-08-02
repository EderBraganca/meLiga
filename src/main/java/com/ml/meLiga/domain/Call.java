package com.ml.meLiga.domain;

import com.ml.meLiga.dtos.CallDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Call {
    private String id;
    private String status;
    private List<User> users;

    public Call(CallDTO callDTO) {
        this.id = callDTO.id();
        this.status = callDTO.status();
        this.users = callDTO.users();
    }
}
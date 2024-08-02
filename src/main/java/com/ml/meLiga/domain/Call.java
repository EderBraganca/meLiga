package com.ml.meLiga.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Call {
    private long id;
    private String status;
    private List<User> users;
}
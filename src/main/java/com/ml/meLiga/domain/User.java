package com.ml.meLiga.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}

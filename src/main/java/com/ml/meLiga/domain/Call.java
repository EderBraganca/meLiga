package com.ml.meLiga.domain;

import com.ml.meLiga.dtos.CallDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "calls")
@Table(name = "calls")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Call {
    @Id
    private String id;
    private String status;
    @ManyToMany
    protected List<User> users;

    public Call(CallDTO callDTO) {
        this.id = callDTO.id();
        this.status = callDTO.status();
        this.users = callDTO.users();
    }
}
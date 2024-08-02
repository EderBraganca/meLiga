package com.ml.meLiga.dtos;

import com.ml.meLiga.domain.User;

import java.util.List;

public record CallDTO(String id, String status, List<User> users) {
}

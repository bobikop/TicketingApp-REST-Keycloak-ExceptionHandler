package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import javax.ws.rs.core.Response;

public interface KeycloakService {

    // Response class provide us user which we created in the Keycloak
    Response userCreate(UserDTO dto);
    void delete(String username);

}
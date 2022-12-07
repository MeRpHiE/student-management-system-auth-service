package com.core.merph.studentmanagementauthservice.controller;

import com.core.merph.studentmanagementauthservice.dto.auth.AuthRequestDTO;
import com.core.merph.studentmanagementauthservice.dto.auth.AuthResponseDTO;
import com.core.merph.studentmanagementauthservice.exception.AuthenticationException;
import com.core.merph.studentmanagementauthservice.service.AuthService;
import com.core.merph.studentmanagementauthservice.service.SMSAuthService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author MeRpHiE
 * e-mail : asiri.abayakoon@gmail.com
 */

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SMSAuthService authService;

    private String authReqStr = null;
    private AuthRequestDTO authRequestDTO = null;

    @BeforeEach
    void setUp() throws JsonProcessingException {
        authRequestDTO = new AuthRequestDTO("asiria", "pass");
        ObjectMapper mapper = new ObjectMapper();
        authReqStr = mapper.writeValueAsString(authRequestDTO);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void authenticateUserForSuccess() throws Exception, AuthenticationException {
        Mockito.when(authService.authenticateUser(authRequestDTO)).thenReturn(new AuthResponseDTO(new Date(), "token"));
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(authReqStr)
                )
                .andExpect(status().isOk());
    }

    @Test
    void logoutUser() throws Exception, AuthenticationException {
        String username = "asiria";
        AuthService spy = Mockito.spy(authService);
        Mockito.doNothing().when(spy).logoutUser(authRequestDTO.getUsername());
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/login/session/logout")
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("username", username))
                .andExpect(status().isOk());
    }
}
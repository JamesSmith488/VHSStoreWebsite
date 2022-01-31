package com.sparta.vhsstorewebsite;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("Get 'Film name' from home page")
    public void homeShouldReturnFilmName() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Film name")));
    }

    @Test
    @DisplayName("Get 'Justin' from about page")
    public void aboutShouldReturnJustin() throws Exception {

        this.mockMvc.perform(get("/about")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Justin")));
    }


    @Test
    @DisplayName("Get 'Submit Details' from customer request page" )
    public void customerRequestShouldReturnSubmitDetails() throws Exception {
        this.mockMvc.perform(get("/customer-request")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Submit Details")));
    }


    @Test
    @DisplayName("Get 'Sign in' from login page" )
    public void loginShouldReturnSignIn() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Sign in")));
    }

    @Test
    @DisplayName("Get 'Try again' from login failed" )
    public void loginFailedShouldReturnTryAgain() throws Exception {
        this.mockMvc.perform(get("/login-failed")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Try again")));
    }


    @Test
    @DisplayName("Get 'Actor First Name' from search-by-actor")
    public void searchByActorShouldReturnActorFirstName() throws Exception {
        this.mockMvc.perform(get("/search-by-actor")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Actor First Name")));
    }

    @Test
    @DisplayName("Get 'Action' from search-by-category")
    public void searchByCategoryShouldReturnAction() throws Exception {
        this.mockMvc.perform(get("/search-by-category")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Action")));
    }

    @Test
    @DisplayName("Get 'SEARCH' from search-by-name")
    public void searchByNameShouldReturnSEARCH() throws Exception {
        this.mockMvc.perform(get("/search-by-name")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("SEARCH")));
    }


}

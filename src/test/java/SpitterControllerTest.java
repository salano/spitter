/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gy.salano.springweb.controller.SpitterController;
import gy.salano.springweb.data.SpitterRepository;
import gy.salano.springweb.libs.Spitter;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

/**
 *
 * @author salano
 */
public class SpitterControllerTest {

    public SpitterControllerTest() {
    }

    /*@Test
    public void shouldShowRegistration() throws Exception {
        SpitterControllerTest controller = new SpitterControllerTest();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }*/

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository
                = mock(SpitterRepository.class);
        Spitter unsaved
                = new Spitter(Long.getLong("2"),"jbauer", "24hours", "Jack", "Bauer");
        Spitter saved
                = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        when(mockRepository.save(unsaved)).thenReturn(saved);
        SpitterController controller
                = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "jbauer")
                .param("password", "24hours"))
                .andExpect(redirectedUrl("/spitter/jbauer"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}

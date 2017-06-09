/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.data;

import gy.salano.springweb.libs.Spitter;
import org.springframework.stereotype.Component;

/**
 *
 * @author salano
 */
@Component
public class SpitterContent implements SpitterRepository {

    @Override
    public Spitter save(Spitter spitter) {
        System.out.println(spitter+" is Saved");
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter(Long.getLong("2"),username, "24hours", "Jack", "Bauer");
    }
    
}

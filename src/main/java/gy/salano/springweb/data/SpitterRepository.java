/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.data;

import gy.salano.springweb.libs.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salano
 */
@Repository
public interface SpitterRepository extends JpaRepository<Spitter, Long>{
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}

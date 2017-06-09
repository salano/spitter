/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.data;

import gy.salano.springweb.libs.Spittle;
import java.util.List;

/**
 *
 * @author salano
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    
    Spittle findOne(long spittleId);
}

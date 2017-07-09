/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author salano
 */

@ResponseStatus(value=HttpStatus.NOT_FOUND,
reason="Spittle Not Found")
public class SpittleNotFoundException extends RuntimeException {
    
}

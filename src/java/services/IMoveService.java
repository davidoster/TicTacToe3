/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Move;

/**
 *
 * @author mac
 */
public interface IMoveService {
    public boolean save(int position, String symbol);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Move;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mac
 */
public class MoveDao implements IMoveDao {

    @Override
    public boolean save(Move move) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("TicTacToe3PU");  
        EntityManager em=emf.createEntityManager();  
        
//         INSERT INTO
        em.getTransaction().begin();
        em.persist(move);
        em.getTransaction().commit();
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.MoveDao;
import entities.Move;
import static java.nio.file.Files.move;
import models.Cell;
import models.Symbol;

/**
 *
 * @author mac
 */
public class MoveService implements IMoveService {

    @Override
    public boolean save(int position, String symbol) {
        Cell cell = new Cell();
        cell.setX(position);
        cell.setY(position);
        Symbol aSymbol = new Symbol(symbol);
        Move move = new Move();
        move.setX(cell.getX());
        move.setY(cell.getY());
        move.setMark(symbol);
        MoveDao dao = new MoveDao();
        return(dao.save(move));
    }
    
}

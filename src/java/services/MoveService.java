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
        // business login
        // we should accept only 0-8 for position
        /*
        | 0 - 0,0 | 1 - 0,1 | 2 - 0,2 | 
        | 3 - 1,0 | 4 - 1,1 | 5 - 1,2 | 
        | 6 - 2,0 | 7 - 2,1 | 8 - 2,2 | 
        */
        Cell cell = new Cell();
        switch(position) {
            case 0:
                cell.setX(position);
                cell.setY(position);
                break;
            case 1:
                cell.setX(0);
                cell.setY(1);
                break;
            case 2:
                cell.setX(0);
                cell.setY(2);
                break;
            case 3:
                cell.setX(1);
                cell.setY(0);
                break;
            case 4:
                cell.setX(1);
                cell.setY(1);
                break;
            case 5:
                cell.setX(1);
                cell.setY(2);
                break;
            case 6:
                cell.setX(2);
                cell.setY(0);
                break;
            case 7:
                cell.setX(2);
                cell.setY(1);
                break;
            case 8:
                cell.setX(2);
                cell.setY(2);
                break;
        }
        Symbol aSymbol = new Symbol(symbol);
        Move move = new Move();
        move.setX(cell.getX());
        move.setY(cell.getY());
        move.setMark(symbol);
        MoveDao dao = new MoveDao();
        return(dao.save(move));
    }
    
}

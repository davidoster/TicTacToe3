/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mac
 */
@Entity
@Table(name = "matches", catalog = "tictactoe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Move.findAll", query = "SELECT m FROM Move m")
    , @NamedQuery(name = "Move.findById", query = "SELECT m FROM Move m WHERE m.id = :id")
    , @NamedQuery(name = "Move.findByX", query = "SELECT m FROM Move m WHERE m.x = :x")
    , @NamedQuery(name = "Move.findByY", query = "SELECT m FROM Move m WHERE m.y = :y")
    , @NamedQuery(name = "Move.findByMark", query = "SELECT m FROM Move m WHERE m.mark = :mark")})
public class Move implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private Integer x;
    private Integer y;
    private String mark;

    public Move() {
    }

    public Move(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Move)) {
            return false;
        }
        Move other = (Move) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Move[ id=" + id + " ]";
    }
    
}

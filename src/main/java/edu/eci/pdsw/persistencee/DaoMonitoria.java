/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistencee;

import edu.eci.pdsw.entities.Monitoria;

/**
 *
 * @author 2101751
 */
public interface DaoMonitoria {
    
    public Monitoria load(int idMonitoria);
    
}

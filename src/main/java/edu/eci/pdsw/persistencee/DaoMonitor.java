/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.persistencee;

import edu.eci.pdsw.entities.Monitor;

/**
 *
 * @author 2101751
 */
public interface DaoMonitor {
    
    public Monitor load(int idMonitor)throws PersistenceException;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.jdbcimpl;

import edu.eci.pdsw.samples.persistencee.DaoMonitoria;
import java.sql.Connection;

/**
 *
 * @author 2101751
 */
public class JDBCDaoMonitoria implements DaoMonitoria{
    
      Connection con;

        public JDBCDaoMonitoria(Connection con) {
        this.con = con;
    }
}

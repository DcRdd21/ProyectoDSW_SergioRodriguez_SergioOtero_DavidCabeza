package com.gf.logic;

import com.gf.dao.TrabajadoresDAO;
import com.gf.entities.Trabajadores;
import java.sql.SQLException;

public class TrabajadoresLN {
 
    public static String insertar(Trabajadores t) throws SQLException{
        if(!TrabajadoresDAO.selectID(t)){
            /*OTRA COMPROBACION POSIBLE PARA COMPROBAR SI SE HACE LA INSERT
                if(SintomasDAO.insert(s)>0)
            */
            TrabajadoresDAO.insert(t);
            return "Los resultados se han guardado correctamente";
        }else{
            return "El test ya existe";
        }
    }
    
    public static String delete(Trabajadores t) throws SQLException{
        if(TrabajadoresDAO.selectID(t)){
            /*OTRA COMPROBACION POSIBLE PARA COMPROBAR SI SE HACE LA DELETE
                if(sintomasDAO.delete(s)>0)
            */
            TrabajadoresDAO.delete(t);
            return "Los resultados se han eliminado correctamente";
        }else{
            return "El test no existe";
        }
    }
    
    public static String update(Trabajadores t) throws SQLException{
        if(TrabajadoresDAO.selectID(t)){
            /*OTRA COMPROBACION POSIBLE PARA COMPROBAR SI SE HACE LA UPDATE
                if(sintomasDAO.update(s)>0)
            */
            TrabajadoresDAO.update(t);
            return "Los resultados se han actualizado correctamente";
        }else{
            return "El test no existe";
        }
    }
    
}

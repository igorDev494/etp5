package com.mycompany.etp4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class UsuariosJPA {

public static Usuarios validarUsuario (Usuarios u) {
    
    EntityManager manager = ConexaoJPA.conectar();

    try {
        Query consulta = manager.createQuery("SELECT u FROM Usuarios u WHERE u.usuario = :usuario AND u.senha = :senha");
        consulta.setParameter("usuario", u.getUsuario());
        consulta.setParameter("senha", u.getSenha());
        
        List<Usuarios> lista = consulta.getResultList();
            

        if(!lista.isEmpty()) {
            return lista.get(0);
        }
        }catch(Exception e) {
            
        manager.getTransaction().rollback();
    }
    return null;
    
}
     
}    


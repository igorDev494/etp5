package com.mycompany.etp4;

import jakarta.persistence.EntityManager;
import java.util.List;

public class ProdutoJPA {
    
 public static void cadastrar(Produto p) {
     EntityManager manager = ConexaoJPA.conectar();
     try{
         manager.getTransaction().begin();
         manager.persist(p);
         manager.getTransaction().commit();
     }catch (Exception e) {
         manager.getTransaction().rollback();
     }
 }

   public static List<Produto> filtrarTodos() {
       EntityManager manager = ConexaoJPA.conectar();
       
   return manager.createQuery("FROM Produto", Produto.class).getResultList();
   }
    
    public static List<Produto> filtrarPorTitulo(String jogo) {
        EntityManager manager = ConexaoJPA.conectar();
        return manager.createQuery("FROM Produto WHERE jogo LIKE :jogo", Produto.class).setParameter("jogo", "%" + jogo + "%").getResultList();
    }
  public static void remover(int id) {
      EntityManager manager = ConexaoJPA.conectar();
      
      try {
          manager.getTransaction().begin();
          
          Produto p = manager.find(Produto.class, id);
          
          if(p != null) {
              manager.remove(p);
          }
            manager.getTransaction().commit();
      }catch(Exception e) {
          manager.getTransaction().rollback();
      }
  }
    
}

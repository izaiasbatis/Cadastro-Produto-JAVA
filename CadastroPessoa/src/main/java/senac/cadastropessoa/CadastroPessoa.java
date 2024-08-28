/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senac.cadastropessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class CadastroPessoa {
    EntityManagerFactory fabricaDePersistencia = Persistence.createEntityManagerFactory("banco_teste");
    EntityManager persistencia = fabricaDePersistencia.createEntityManager();
    
    public void salvarPessoa(Cadastro p){
        persistencia.getTransaction().begin();
        //inserte into pessoa values(?,?,?)
        persistencia.persist(p);
        persistencia.getTransaction().commit();
        persistencia.close();
        fabricaDePersistencia.close();
   
    }
    
}

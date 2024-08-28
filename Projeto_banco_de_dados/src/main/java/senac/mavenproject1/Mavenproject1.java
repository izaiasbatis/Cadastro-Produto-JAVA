/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senac.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        PessoaPersistencia per = new PessoaPersistencia();
        Pessoa p = new Pessoa();
        per.salvarPessoa(p);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadoseclasses;

import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Izaias
 */
    public class TabelaProdutos extends AbstractTableModel{
    /*criando um array para ser populado com dados da classe CadastroProduto*/
    private ArrayList<CadastroProduto> TabelaProduto;
    
    /*Criando o metodo de coluns existentes na tabela*/
    private String[] colunas = {"Codigo","Produto","Código Barras","UN","Peso Bruto"};
    
    /*criando método para o array receber os dados atribuidos a ele*/
    public TabelaProdutos(){
    /*instanciando o array*/
    this.TabelaProduto = new ArrayList<CadastroProduto>();
    }
    /*Criando metodo para adicionar o conteúdo e atualizar a tabela*/
    public void Adicionar(CadastroProduto cad){
    this.TabelaProduto.add(cad);
    fireTableDataChanged();
    }
/*Criando metodo para remover o conteúdo e atualizar a tabela*/
    public void Remover(int linha){
    this.TabelaProduto.remove(linha);
    fireTableDataChanged();
    }


    /*atualizando os override's*/
    @Override
    public int getRowCount() {
    return this.TabelaProduto.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.TabelaProduto.get(rowIndex).getCodigo();
            case 1:
                return this.TabelaProduto.get(rowIndex).getProduto();  
            case 2:
                return this.TabelaProduto.get(rowIndex).getCodigoBarra(); 
            case 3:
                return this.TabelaProduto.get(rowIndex).getUN();
            case 4:
                return this.TabelaProduto.get(rowIndex).getPesoBruto();
            default:
                return this.TabelaProduto.get(rowIndex);
        }
    }
    
    /*aqui esotu criando algo que acredito ser um metodo que pega a coluna selecionada*/
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
    
}
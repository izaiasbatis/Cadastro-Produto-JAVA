/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadoseclasses;

import javax.swing.table.AbstractTableModel;



/*Criando o método para solicitar os dados do produto no cadastro*/
public class CadastroProduto {
    private String Codigo;
    private String Produto;
    private String CodigoBarra;
    private String UN;
    private double PesoBruto;

    /*Encapsulando as entradas:
    -Botão Direito
    -Refactor
    -Encapsulate fields
    -Selecionando tudo
    */

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Produto
     */
    public String getProduto() {
        return Produto;
    }

    /**
     * @param Produto the Produto to set
     */
    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    /**
     * @return the CodigoBarra
     */
    public String getCodigoBarra() {
        return CodigoBarra;
    }

    /**
     * @param CodigoBarra the CodigoBarra to set
     */
    public void setCodigoBarra(String CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    /**
     * @return the UN
     */
    public String getUN() {
        return UN;
    }

    /**
     * @param UN the UN to set
     */
    public void setUN(String UN) {
        this.UN = UN;
    }

    /**
     * @return the PesoBruto
     */
    public double getPesoBruto() {
        return PesoBruto;
    }

    /**
     * @param PesoBruto the PesoBruto to set
     */
    public void setPesoBruto(double PesoBruto) {
        this.PesoBruto = PesoBruto;
    }
   
}
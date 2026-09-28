package com.mycompany.etp4;

/**
 *
 * @author Igor
 */
public class Fornecedor {
    
    private String nomeFornecedor;
    private String cnpj;
    private String telefone;
    private String dataEntrega;

    public Fornecedor() {
    }

    public Fornecedor(String nomeFornecedor, String cnpj, String telefone, String dataEntrega) {
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.dataEntrega = dataEntrega;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    
    
}

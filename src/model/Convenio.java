package model;

import controller.DataAccessObject;
import java.util.ArrayList;

// camada de negócio
public class Convenio extends DataAccessObject {

    // atributos criados a partir da tabela CONVENIO do banco de dados
    private int codigoConvenio;
    private String empresaConvenio;
    private String cnpj;
    private String telefone;

    public Convenio() {
        super("convenio");
    }

    public int getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(int codigoConvenio) {
        if (codigoConvenio != this.codigoConvenio) {
            this.codigoConvenio = codigoConvenio;
            addChange("codigo_convenio", this.codigoConvenio);
        }
    }

    public String getEmpresaConvenio() {
        return empresaConvenio;
    }

    public void setEmpresaConvenio(String empresaConvenio) {
        if (!empresaConvenio.equals(this.empresaConvenio)) {
            this.empresaConvenio = empresaConvenio;
            addChange("empresa_convenio", this.empresaConvenio);
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (!cnpj.equals(this.cnpj)) {
            this.cnpj = cnpj;
            addChange("cnpj", this.cnpj);
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!telefone.equals(this.telefone)) {
            this.telefone = telefone;
            addChange("telefone", this.telefone);
        }
    }

    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_convenio = " + this.codigoConvenio;
    }

    @Override
    public void fill(ArrayList<Object> data) {
        this.codigoConvenio = (int) data.get(0);
        this.empresaConvenio = (String) data.get(1);
        this.cnpj = (String)data.get(2);
        this.telefone = (String) data.get(3);
    }

}

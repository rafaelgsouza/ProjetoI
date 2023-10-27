package model;

import controller.DataAccessObject;
import java.util.ArrayList;

// mapeamento com a tabela especialidades do banco de dados
public class Especialidades extends DataAccessObject{
    
    // atributos criados a partir da tabela ESPECIALIDADES do banco de dados
    private int codigoEspecialidade;
    private String descricaoEspecialidade;
    
    public Especialidades(){
        super("especialidades");
    }

    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(int codigoEspecialidade) {
        if( codigoEspecialidade != this.codigoEspecialidade ){
            this.codigoEspecialidade = codigoEspecialidade;
            addChange("codigo_especialidade", this.codigoEspecialidade);
        }
    }

    public String getDescricaoEspecialidade() {
        return descricaoEspecialidade;
    }

    public void setDescricaoEspecialidade(String descricaoEspecialidade) {
        if(!descricaoEspecialidade.equals(this.descricaoEspecialidade)){
            this.descricaoEspecialidade = descricaoEspecialidade;
            addChange("descricao_especialidade", this.descricaoEspecialidade);
        }
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_especialidade = " + this.codigoEspecialidade;
    }

    @Override
    public void fill(ArrayList<Object> data) {
       this.codigoEspecialidade = (int) data.get(0);
       this.descricaoEspecialidade = (String) data.get(1);
    }
    
    
    
}

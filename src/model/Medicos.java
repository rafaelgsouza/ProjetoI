package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Medicos extends DataAccessObject{
    
    private int codigoMedico;
    private String nome;
    private String crm;
    private int codigoEspecialidade;// chave estrangeira

    public Medicos(){
        super("medicos");
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        if(codigoMedico != this.codigoMedico){
            this.codigoMedico = codigoMedico;
            addChange("codigo_medico", this.codigoMedico);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if( !nome.equals(this.nome)){
            this.nome = nome;
            addChange("nome", this.nome);
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if(!crm.equals(this.crm)){
            this.crm = crm;
            addChange("crm", this.crm);
        }
    }

    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(int codigoEspecialidade) {
        if(codigoEspecialidade != this.codigoEspecialidade){
            this.codigoEspecialidade = codigoEspecialidade;
            addChange("codigo_especialidade", this.codigoEspecialidade);
        }
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_medico = " + this.codigoMedico;
    }

    @Override
    public void fill(ArrayList<Object> data) {
        this.codigoMedico = (int) data.get(0);
        this.nome = (String) data.get(1);
        this.crm = (String) data.get(2);
        this.codigoEspecialidade = (int) data.get(3);
    }
    
}

package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Usuario extends DataAccessObject {

    private int codigoUsuario;
    private String identificacaoUsuario;
    private String senhaAcesso;
    private String cadastroUsuario;
    private String cadastroPaciente;
    private String cadastroEspecialidade;
    private String cadastroMedico;
    private String cadastroConvenio;
    private String agendamentoConsulta;
    private String moduloAdministrativo;
    private String moduloAgendamento;
    private String moduloAtendimento;
    private String nomeCompleto;
    private String dataNascimento;
    private String numeroRG;
    private String orgaoEmissor;
    private String numeroCPF;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;

    public Usuario() {
        super("usuario");
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        if (this.codigoUsuario != codigoUsuario) {
            this.codigoUsuario = codigoUsuario;
            addChange("codigo_usuario", this.codigoUsuario);
        }
    }

    public String getIdentificacaoUsuario() {
        return identificacaoUsuario;
    }

    public void setIdentificacaoUsuario(String identificacaoUsuario) {
        if (!identificacaoUsuario.equals(this.identificacaoUsuario)) {
            this.identificacaoUsuario = identificacaoUsuario;
            addChange("identificacao_usuario", this.identificacaoUsuario);
        }
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        if (!senhaAcesso.equals(this.senhaAcesso)) {
            this.senhaAcesso = senhaAcesso;
            addChange("senha_acesso", this.senhaAcesso);
        }
    }

    public String getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(String cadastroUsuario) {
        if (!cadastroUsuario.equals(this.cadastroUsuario)) {
            this.cadastroUsuario = cadastroUsuario;
            addChange("cadastro_usuario", this.cadastroUsuario);
        }
    }

    public String getCadastroPaciente() {
        return cadastroPaciente;
    }

    public void setCadastroPaciente(String cadastroPaciente) {
        if (!cadastroPaciente.equals(cadastroPaciente)) {
            this.cadastroPaciente = cadastroPaciente;
            addChange("cadastro_paciente", this.cadastroPaciente);
        }
    }

    public String getCadastroEspecialidade() {
        return cadastroEspecialidade;
    }

    public void setCadastroEspecialidade(String cadastroEspecialidade) {
        if (!cadastroEspecialidade.equals(this.cadastroEspecialidade)) {
            this.cadastroEspecialidade = cadastroEspecialidade;
            addChange("cadastro_especialidade", this.cadastroEspecialidade);
        }
    }

    public String getCadastroMedico() {
        return cadastroMedico;
    }

    public void setCadastroMedico(String cadastroMedico) {
        if (!cadastroMedico.equals(this.cadastroMedico)) {
            this.cadastroMedico = cadastroMedico;
            addChange("cadastro_medico", this.cadastroMedico);
        }
    }

    public String getCadastroConvenio() {
        return cadastroConvenio;
    }

    public void setCadastroConvenio(String cadastroConvenio) {
        if (!cadastroConvenio.equals(this.cadastroConvenio)) {
            this.cadastroConvenio = cadastroConvenio;
            addChange("cadastro_convenio", this.cadastroConvenio);
        }
    }

    public String getAgendamentoConsulta() {
        return agendamentoConsulta;
    }

    public void setAgendamentoConsulta(String agendamentoConsulta) {
        if (!agendamentoConsulta.equals(this.agendamentoConsulta)) {
            this.agendamentoConsulta = agendamentoConsulta;
            addChange("agendamento_consulta", this.agendamentoConsulta);
        }
    }

    public String getModuloAdministrativo() {
        return moduloAdministrativo;
    }

    public void setModuloAdministrativo(String moduloAdministrativo) {
        if (!moduloAdministrativo.equals(this.moduloAdministrativo)) {
            this.moduloAdministrativo = moduloAdministrativo;
            addChange("modulo_administrativo", this.moduloAdministrativo);
        }
    }

    public String getModuloAgendamento() {
        return moduloAgendamento;
    }

    public void setModuloAgendamento(String moduloAgendamento) {
        if (!moduloAgendamento.equals(this.moduloAgendamento)) {
            this.moduloAgendamento = moduloAgendamento;
            addChange("modulo_agendamento", this.moduloAgendamento);
        }
    }

    public String getModuloAtendimento() {
        return moduloAtendimento;
    }

    public void setModuloAtendimento(String moduloAtendimento) {
        if (!moduloAtendimento.equals(this.moduloAtendimento)) {
            this.moduloAtendimento = moduloAtendimento;
            addChange("modulo_atendimento", this.moduloAtendimento);
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if (!nomeCompleto.equals(this.nomeCompleto)) {
            this.nomeCompleto = nomeCompleto;
            addChange("nome_completo", this.nomeCompleto);
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (!dataNascimento.equals(this.dataNascimento)) {
            this.dataNascimento = dataNascimento;
            addChange("data_nascimento", this.dataNascimento);
        }
    }

    public String getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(String numeroRG) {
        if(!numeroRG.equals(this.numeroRG)){
            this.numeroRG = numeroRG;
            addChange("numero_rg", this.numeroRG);
        }
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        if(!orgaoEmissor.equals(this.orgaoEmissor)){
            this.orgaoEmissor = orgaoEmissor;
            addChange("orgao_emissor", this.orgaoEmissor);
        }
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        if(!numeroCPF.equals(this.numeroCPF)){
            this.numeroCPF = numeroCPF;
            addChange("numero_cpf", this.numeroCPF);
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(!endereco.equals(this.endereco)){
            this.endereco = endereco;
            addChange("endereco", this.endereco);
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(!numero.equals(this.numero)){
            this.numero = numero;
            addChange("numero", this.numero);
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if(!complemento.equals(this.complemento)){
            this.complemento = complemento;
            addChange("complemento", this.complemento);
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(!bairro.equals(this.bairro)){
            this.bairro = bairro;
            addChange("bairro", this.bairro);
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(!cidade.equals(this.cidade)){
            this.cidade = cidade;
            addChange("cidade", this.cidade);
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(!estado.equals(this.estado)){
            this.estado = estado;
            addChange("estado", this.estado);
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(!telefone.equals(this.telefone)){
            this.telefone = telefone;
            addChange("telefone", this.telefone);
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if(!celular.equals(this.celular)){
            this.celular = celular;
            addChange("celular", this.celular);
        }
    }

    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_usuario = " + this.codigoUsuario;
    }

    @Override
    public void fill(ArrayList<Object> data) {
        this.codigoUsuario = (int) data.get(0);
        this.identificacaoUsuario = (String) data.get(1);
        this.senhaAcesso = (String) data.get(2);
        this.cadastroUsuario = (String) data.get(3);
        this.cadastroPaciente = (String) data.get(4);
        this.cadastroEspecialidade = (String) data.get(5);
        this.cadastroMedico = (String) data.get(6);
        this.cadastroConvenio = (String) data.get(7);
        this.agendamentoConsulta = (String) data.get(8);
        this.moduloAdministrativo = (String) data.get(9);
        this.moduloAgendamento = (String) data.get(10);
        this.moduloAtendimento = (String) data.get(11);
        this.nomeCompleto = (String) data.get(12);
        this.dataNascimento = (String) data.get(13);
        this.numeroRG = (String) data.get(14);
        this.orgaoEmissor = (String) data.get(15);
        this.numeroCPF = (String) data.get(16);
        this.endereco = (String) data.get(17);
        this.numero = (String) data.get(18);
        this.complemento = (String) data.get(19);
        this.bairro = (String) data.get(20);
        this.cidade = (String) data.get(21);
        this.estado = (String) data.get(22);
        this.telefone = (String) data.get(23);
        this.celular = (String) data.get(24);
    }

}

package view;

import java.awt.event.WindowEvent;
import model.Usuario;

/**
 *
 * @author Rafael Godoy
 */
public class JFrameUsuarioCRUD extends javax.swing.JFrame {
    
    private Usuario usuario;
    private boolean disconnectOnClose;
    
    /**
     * Creates new form JFrameUsuarioCRUD
     */
    public JFrameUsuarioCRUD(Usuario usuario, boolean disconnectOnClose) {
        initComponents();
        
        if(usuario == null){
            this.usuario = new Usuario();
        } else{
            this.usuario = usuario;
            dataUp();
            jTextFieldId.setEditable(false);
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
    private void checkInput() throws Exception{
        // checar se o campo ID está no formato correto
        if(!jTextFieldId.getText().isEmpty() && !jTextFieldId.getText().matches("\\d+")){
            throw new Exception("O campo ID precisa ser um número");
        }
        
        // checar se o campo Data de Nascimento está no formato correto
        if( jTextFieldDataNascimento.getText().isEmpty() || !jTextFieldDataNascimento.getText().matches("\\d{4}-\\d{2}-\\d{2}") ){
            throw new Exception("A data de nascimento deve seguir o formato AAAA-MM-DD");
        }
                    
    }
    
    public void dataDown() {
        // usuario.setter
        // java.swing.getter
        
        usuario.setCodigoUsuario(Integer.parseInt(jTextFieldId.getText()));
        usuario.setIdentificacaoUsuario(jTextFieldIdentificacao.getText());
        usuario.setSenhaAcesso(jTextFieldSenha.getText());

        if( jCheckBoxUsuario.isSelected() ) {
            usuario.setCadastroUsuario("S");
        } else {
            usuario.setCadastroUsuario("N");
        }
        
        if( jCheckBoxPaciente.isSelected()){
            usuario.setCadastroPaciente("S");
        }else{
            usuario.setCadastroPaciente("N");
        }
        
        if(jCheckBoxEspecialidade.isSelected()){
            usuario.setCadastroEspecialidade("S");
        }else{
            usuario.setCadastroEspecialidade("N");
        }
        
        if(jCheckBoxMedico.isSelected()){
            usuario.setCadastroMedico("S");
        }else{
            usuario.setCadastroMedico("N");
        }
        
        if(jCheckBoxConvenio.isSelected()){
            usuario.setCadastroConvenio("S");
        }else{
            usuario.setCadastroConvenio("N");
        }
        
        if(jCheckBoxAdministrativo.isSelected()){
            usuario.setModuloAdministrativo("S");
        }else{
            usuario.setModuloAdministrativo("N");
        }
        
//        usuario.setAgendamentoConsulta(jTextFieldAgendamentoConsulta.getText());
        
        if(jCheckBoxAgendamento.isSelected()){
            usuario.setModuloAgendamento("S");
        }else{
            usuario.setModuloAgendamento("N");
        }

        if(jCheckBoxAtendimento.isSelected()){
            usuario.setModuloAtendimento("S");
        }else{
            usuario.setModuloAtendimento("N");
        }

        usuario.setNomeCompleto(jTextFieldNomeCompleto.getText());
        usuario.setDataNascimento(jTextFieldDataNascimento.getText());
        usuario.setNumeroRG(jTextFieldNumeroRG.getText());
        usuario.setOrgaoEmissor(jTextFieldOrgaoEmissor.getText());
        usuario.setNumeroCPF(jTextFieldNumeroCPF.getText());
        usuario.setEndereco(jTextFieldEndereco.getText());
        usuario.setNumero(jTextFieldNumero.getText());
        usuario.setComplemento(jTextFieldComplemento.getText());
        usuario.setBairro(jTextFieldBairro.getText());
        usuario.setCidade(jTextFieldCidade.getText());
        usuario.setEstado(jTextFieldEstado.getText());
        usuario.setTelefone(jTextFieldTelefone.getText());
        usuario.setCelular(jTextFieldCelular.getText());
    }
    public void dataUp(){
        //usuario.getter
        //java.swing.setter
        
        jTextFieldId.setText(String.valueOf(usuario.getCodigoUsuario()));
        jTextFieldIdentificacao.setText(usuario.getIdentificacaoUsuario());
        jTextFieldSenha.setText(usuario.getSenhaAcesso());

        if( ( usuario.getCadastroUsuario() != null ) &&
              ( usuario.getCadastroUsuario().equals("S") ) ) {
            jCheckBoxUsuario.setSelected( true );
        } else {
            jCheckBoxUsuario.setSelected( false );
        }
        
        if( ( usuario.getCadastroPaciente()!= null ) &&
              ( usuario.getCadastroPaciente().equals("S") ) ) {
            jCheckBoxPaciente.setSelected( true );
        } else {
            jCheckBoxPaciente.setSelected( false );
        }
        
        if( ( usuario.getCadastroEspecialidade()!= null ) &&
              ( usuario.getCadastroEspecialidade().equals("S") ) ) {
            jCheckBoxEspecialidade.setSelected( true );
        } else {
            jCheckBoxEspecialidade.setSelected( false );
        }
        
        if( ( usuario.getCadastroMedico()!= null ) &&
              ( usuario.getCadastroMedico().equals("S") ) ) {
            jCheckBoxMedico.setSelected( true );
        } else {
            jCheckBoxMedico.setSelected( false );
        }
        
        if( ( usuario.getCadastroConvenio()!= null ) &&
              ( usuario.getCadastroConvenio().equals("S") ) ) {
            jCheckBoxConvenio.setSelected( true );
        } else {
            jCheckBoxConvenio.setSelected( false );
        }
        
//        jTextFieldAgendamentoConsulta.setText(usuario.getAgendamentoConsulta());

        if( ( usuario.getModuloAdministrativo()!= null ) &&
              ( usuario.getModuloAdministrativo().equals("S") ) ) {
            jCheckBoxAdministrativo.setSelected( true );
        } else {
            jCheckBoxAdministrativo.setSelected( false );
        }
        
        if( ( usuario.getModuloAgendamento()!= null ) &&
              ( usuario.getModuloAgendamento().equals("S") ) ) {
            jCheckBoxAgendamento.setSelected( true );
        } else {
            jCheckBoxAgendamento.setSelected( false );
        }
        
        if( ( usuario.getModuloAtendimento()!= null ) &&
              ( usuario.getModuloAtendimento().equals("S") ) ) {
            jCheckBoxAtendimento.setSelected( true );
        } else {
            jCheckBoxAtendimento.setSelected( false );
        }
        
        jTextFieldNomeCompleto.setText(usuario.getNomeCompleto());
        jTextFieldDataNascimento.setText(usuario.getDataNascimento());
        jTextFieldNumeroRG.setText(usuario.getNumeroRG());
        jTextFieldOrgaoEmissor.setText(usuario.getOrgaoEmissor());
        jTextFieldNumeroCPF.setText(usuario.getNumeroCPF());
        jTextFieldEndereco.setText(usuario.getEndereco());
        jTextFieldNumero.setText(usuario.getNumero());
        jTextFieldComplemento.setText(usuario.getComplemento());
        jTextFieldBairro.setText(usuario.getBairro());
        jTextFieldCidade.setText(usuario.getCidade());
        jTextFieldEstado.setText(usuario.getEstado());
        jTextFieldTelefone.setText(usuario.getTelefone());
        jTextFieldCelular.setText(usuario.getCelular());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelIdentificacao = new javax.swing.JLabel();
        jTextFieldIdentificacao = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jTextFieldNumeroRG = new javax.swing.JTextField();
        jLabelNumeroRG = new javax.swing.JLabel();
        jLabelOrgaoEmissor = new javax.swing.JLabel();
        jTextFieldOrgaoEmissor = new javax.swing.JTextField();
        jLabelNumeroCPF = new javax.swing.JLabel();
        jTextFieldNumeroCPF = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanelCadastro = new javax.swing.JPanel();
        jCheckBoxUsuario = new javax.swing.JCheckBox();
        jCheckBoxMedico = new javax.swing.JCheckBox();
        jCheckBoxPaciente = new javax.swing.JCheckBox();
        jCheckBoxConvenio = new javax.swing.JCheckBox();
        jCheckBoxEspecialidade = new javax.swing.JCheckBox();
        jCheckBoxConsulta = new javax.swing.JCheckBox();
        jLabelCadastros = new javax.swing.JLabel();
        jPanelModulo = new javax.swing.JPanel();
        jCheckBoxAdministrativo = new javax.swing.JCheckBox();
        jCheckBoxAgendamento = new javax.swing.JCheckBox();
        jCheckBoxAtendimento = new javax.swing.JCheckBox();
        jLabelModulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelId.setText("ID:");

        jLabelIdentificacao.setText("Identificação:");

        jLabelSenha.setText("Senha:");

        jLabelNomeCompleto.setText("Nome Completo:");

        jLabelDataNascimento.setText("Data Nascimento:");

        jLabelNumeroRG.setText("Numero RG:");

        jLabelOrgaoEmissor.setText("Orgao Emissor:");

        jLabelNumeroCPF.setText("Numero CPF:");

        jLabelEndereco.setText("Endereço:");

        jLabelNumero.setText("Número:");

        jLabelComplemento.setText("Complemento:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("Estado:");

        jLabelTelefone.setText("Telefone:");

        jLabelCelular.setText("Celular:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxUsuario.setText("Usuário");

        jCheckBoxMedico.setText("Médico");

        jCheckBoxPaciente.setText("Paciente");

        jCheckBoxConvenio.setText("Convênio");

        jCheckBoxEspecialidade.setText("Especialidade");

        jCheckBoxConsulta.setText("Consulta");

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPaciente)
                    .addComponent(jCheckBoxUsuario)
                    .addComponent(jCheckBoxEspecialidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jCheckBoxConsulta)
                        .addGap(17, 17, 17))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxConvenio)
                            .addComponent(jCheckBoxMedico))
                        .addContainerGap())))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxUsuario)
                    .addComponent(jCheckBoxMedico))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPaciente)
                    .addComponent(jCheckBoxConvenio))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEspecialidade)
                    .addComponent(jCheckBoxConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCadastros.setText("Cadastros");

        jPanelModulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxAdministrativo.setText("Administrativo");

        jCheckBoxAgendamento.setText("Agendamento");

        jCheckBoxAtendimento.setText("Atendimento");

        javax.swing.GroupLayout jPanelModuloLayout = new javax.swing.GroupLayout(jPanelModulo);
        jPanelModulo.setLayout(jPanelModuloLayout);
        jPanelModuloLayout.setHorizontalGroup(
            jPanelModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanelModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAtendimento)
                    .addComponent(jCheckBoxAgendamento)
                    .addComponent(jCheckBoxAdministrativo))
                .addGap(67, 67, 67))
        );
        jPanelModuloLayout.setVerticalGroup(
            jPanelModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxAdministrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxAtendimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelModulo.setText("Módulos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumeroRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelOrgaoEmissor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumeroCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumeroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelNomeCompleto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNomeCompleto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelDataNascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelIdentificacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadastros))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelModulo)
                            .addComponent(jPanelModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeCompleto)
                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdentificacao)
                    .addComponent(jTextFieldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroRG)
                    .addComponent(jLabelOrgaoEmissor)
                    .addComponent(jTextFieldOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroCPF)
                    .addComponent(jTextFieldNumeroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastros)
                    .addComponent(jLabelModulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelModulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.out.println("Desconectar");

        if (this.disconnectOnClose) {
            try {
                usuario.disconnectFromDatabase();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        try {
            checkInput();
            dataDown();
            usuario.save();
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        System.out.println("Excluir");

        try {
            checkInput();
            dataDown();
            this.usuario.delete();
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAdministrativo;
    private javax.swing.JCheckBox jCheckBoxAgendamento;
    private javax.swing.JCheckBox jCheckBoxAtendimento;
    private javax.swing.JCheckBox jCheckBoxConsulta;
    private javax.swing.JCheckBox jCheckBoxConvenio;
    private javax.swing.JCheckBox jCheckBoxEspecialidade;
    private javax.swing.JCheckBox jCheckBoxMedico;
    private javax.swing.JCheckBox jCheckBoxPaciente;
    private javax.swing.JCheckBox jCheckBoxUsuario;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdentificacao;
    private javax.swing.JLabel jLabelModulo;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroCPF;
    private javax.swing.JLabel jLabelNumeroRG;
    private javax.swing.JLabel jLabelOrgaoEmissor;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelModulo;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdentificacao;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldNumeroCPF;
    private javax.swing.JTextField jTextFieldNumeroRG;
    private javax.swing.JTextField jTextFieldOrgaoEmissor;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}

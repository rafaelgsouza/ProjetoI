package _exemplos;

import java.sql.SQLException;
import model.Convenio;

public class ConvenioTeste {

    public static void main(String[] args) throws SQLException {
        
        // objeto persistente
        
        Convenio convenio = new Convenio();
        convenio.setCodigoConvenio(14);
        convenio.setEmpresaConvenio("100% Saúde");
        convenio.save();
        
//        convenio.setCodigoConvenio(14);
//        convenio.load();
//        System.out.println(convenio.getCodigoConvenio());
//        System.out.println(convenio.getEmpresaConvenio());
//        System.out.println(convenio.getCnpj());
//        System.out.println(convenio.getTelefone());
        
//        convenio.setCnpj("97.267.798/0001-72");
//        convenio.setTelefone("(16) 3484-1867");
//        convenio.update();
//        convenio.delete();
    }

}

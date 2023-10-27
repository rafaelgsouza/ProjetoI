package controller;

// configurações do projeto
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

// "jdbc:mysql://127.0.0.1:3307/sgcm_aq3012514" - url para as atividades em sala
// "jdbc:mysql://localhost:3306/sgcm_aq3012514" - url para as atividades em casa
// "jdbc:mysql://sql.freedb.tech/freedb_sgcm_aq3012514" - url para acesso a plataforma FreeDB

public class AppConfig {

    private static String url;
    private static String user;
    private static String password;

    private AppConfig() {
    }

    private static void readXml() {

        File file = new File("app-config.xml");
        if (file.exists()) {

            try {
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.parse(file);
                doc.getDocumentElement().normalize();
                
                Element root = doc.getDocumentElement();
                Node node = root.getElementsByTagName("database").item(0);
                
                url = node.getAttributes().getNamedItem("url").getNodeValue();
                user = node.getAttributes().getNamedItem("user").getNodeValue();
                password = node.getAttributes().getNamedItem("password").getNodeValue();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    public static String getUrl() {
        if(url == null){
            readXml();
        }
        
        return url;
    }

    public static String getUser() {
        if(user == null){
            readXml();
        }
        
        return user;
    }

    public static String getPassword() {
        if(password == null){
            readXml();
        }
        
        return password;
    }
    
}

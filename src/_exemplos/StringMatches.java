package _exemplos;

// expressões regulares
public class StringMatches {

    public static void main(String[] args) {

        String str = "aa";
        // . (ponto) identifica uma única instância de QUALQUER caractere
        String regex = ".";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "aa";
        // \d identifica uma única instância de caractere numerico 
        regex = "\\d";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "11";
        regex = "\\d";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "1";
        regex = "\\d";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "1";
        // \D identifica uma única instância de caractere não numerico
        regex = "\\D";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "ç";
        regex = "\\D";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "1";
        regex = "\\d";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "a";
        // [aeiou] identifica se um único caractere é uma vogal
        // [] cria um intervalo para verificar caracteres que não tem classe definida
        regex = "[aeiou]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "t";
        regex = "[aeiou]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "t";
        // \w qualquer letra (em letras maisculas ou minisculas), qualquer digito ou o caractere sublinhado
        regex = "\\w";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "T";
        regex = "\\w";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "T";
        // [a-z] identifica se uma única instância é um caractere minusculo
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "r";
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "T";
        // [a-zA-Z] identifica se uma única instância é um caractere minusculo OU maisculo
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = " ";
        // \s identifica se uma única instância é um caractere espaço
        regex = "\\s";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = " ";
        // [A-Z][a-z] identifica se DUAS instâncias são: a primeira APENAS maisculas e a segunda APENAS minusculas
        regex = "[A-Z][a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Ra";
        regex = "[A-Z][a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Rafael";
        regex = "[A-Z][a-z][a-z][a-z][a-z][a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Rafael";
        // o caracterer + identifica a expressão que vem atrás dele
        // + : UMA ou MAIS ocorrencias da subexpressão anterior
        regex = "[A-Z][a-z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "R";
        // o caracterer * identifica a expressão que vem atrás dele
        // * : ZERO ou MAIS ocorrencias da subexpressão anterior
        regex = "[A-Z][a-z]*";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "R-";
        regex = "[A-Z]-[a-z]*";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        // uma formatação do CEP
        str = "12345-678";
        regex = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Rafael Godoy Souza";
        // [A-Z][a-z]+ define o primeiro nome
        // (\\s[A-Z][a-z]+)* define o sobrenome
        // () é usado para agrupar a expressão para o quantificador (+ ou *)
        regex = "[A-Z][a-z]+(\\s[A-Z][a-z]+)*";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "M";
        // ^ nega toda a expressão que vem após
        // ^ quaquer caractere diferente dos indicados
        regex = "[^aeiou]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "+55(12)12345-6789";
        // (\\+\\d{2,})? := ? garante ZERO ou UMA ocorrência da expressão anterior
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        //formatação para cnpj (classe Convenio) no formato XX.XXX.XXX/XXXX-XX
        str = "39.622.299/0001-51";
        regex = "(\\d{2})\\.(\\d{3})\\.(\\d{3})\\/(\\d{4})-(\\d{2})";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        //formatação para crm (classe Medicos) no formato XXXXXX-AA
        str = "163120-SP";
        regex = "(\\d{4,6})-[A-Z][A-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
    }

}

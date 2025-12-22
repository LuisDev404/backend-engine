package JavaBasic;

public class LogicalOperators {
    public static void main(String[] args) {
        
        // Os operadores logicos são:

        // Menor & Maior (< >): que tem que ver se o resultado vai ser menor ou maior
        boolean isTrue = 10 < 20;
        boolean isFalse = 10 > 20;
        System.out.println(isTrue);
        System.out.println(isFalse);

        //  Menor ou Igual & Maior ou Igual (<= =>): que faz a mesma coisa do anterior só que agora ele também verifica se e igual
        boolean isFour = 4 <= 4;
        boolean isFive = 5 >= 5;
        System.out.println(isFour);
        System.out.println(isFive);

        //  Igual (==): o igual e diferente do jeito que fazemos ja que temos que colocar 2 sinais de igual
        boolean isEqual = 200 == 200;
        System.out.println(isEqual);

        // Diferente (!=): como seu proprio nome diz ele vai verificar se os dados sãp diferentes 
        boolean different = 10 != 11; /*Aqui o resultado será true ja os dados são diferentes*/
        System.out.println(different);
    }
}

package ac2_cienciasexatas;

public class ADS2_Exercicio_5_PedroFerraz {

    public static void main(String[] args) {
        
        int Tabela1 = 33;

        for(int i = Tabela1; i <= 126; i++){
            String convertido1 = Character.toString((char)i);
            System.out.println(i + " = "+ convertido1);
        }
            
        int Tabela2 = 161;

        for(int x = Tabela2; x <= 255; x++){
            String convertido2 = Character.toString((char)x);
            System.out.println(x + " = " + convertido2);
        }
    }
    
}

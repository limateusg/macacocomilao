package exercicios;

import java.util.Scanner;

public class MacacoGuloso {
    
    public static void main(String[] args) {
        
        System.out.println("Qual o nome do macaco?");
        Scanner sc = new Scanner(System.in);
        String macacoNome = sc.nextLine();
        
        SistemaDigestivo macaco = new SistemaDigestivo(macacoNome);
        
        boolean buchoVazio = true;
        
        while (buchoVazio) {
            System.out.println("O que o macaco comeu?");
            String maisComida = sc.nextLine();
            
            macaco.comerMais(maisComida);
            
            if (macaco.estaSaciado()) {
                buchoVazio = false;
            }
            
            System.out.println(macaco);
        }
        
        sc.close();
    }	
}
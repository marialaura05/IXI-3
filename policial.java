import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class policial {
    public static void main(String[] args) {
        String nome;
        int idade,sexo;
        Scanner ler = new Scanner(System.in);
        idade=0;
        System.out.print("digite o nome do cidadão: ");
        nome= ler.nextLine();
        System.out.print("Digite o sexo do cidadão (M=1/F=2): ");
        sexo= ler.nextInt();
        System.out.print("Digite a idade do cidadão: ");
        idade= ler.nextInt();
        System.out.println("==================================");
        if ((sexo==1) && (idade>=18)){
            System.out.println(nome+ " está apto para o alistamento militar");
        }else {
            System.out.println(nome + " não está apto para o alistamento militar");
        }
    }

}

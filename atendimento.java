package ProjetoAldo;
import java.util.Scanner;


public class atendimento {
    public static void main(){
        LinkedIntList l = new LinkedIntList();
        li.addFirst();
        Scanner l = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("(1)Gerar senha para preferencial");
        System.out.println("(2)Gerar senha para Aluno");
        System.out.println("(3)Gerar senha para Professor");
        System.out.println("(4)Gerar senha para Visitante");
        System.out.println("(5)Mostrar senhas");
        System.out.println("(6)Chamar senha");
        System.out.println("----------------------------------------");
        int opc = l.nextInt();
        switch (opc){
            case 1:
                li.add(opc);

                break;

            case 2:
                li.add(opc);
                break;

            case 3:
                li.add(opc);
                break;

            case 4:
                li.add(opc);
                break;

            case 5:
                li.print();
                break;

            case 6:
                li.remove();
                break;
        }

    }
}

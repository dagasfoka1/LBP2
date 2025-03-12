import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Teste
{
public static void main(String args[]){
    List<Integer> lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Numero1");
    int numero1 = sc.nextInt();
    System.out.println("Numero2");
    int numero2 = sc.nextInt();
    System.out.println("Numero3");
    int numero3 = sc.nextInt();
    lista.add(numero1);
    lista.add(numero2);
    lista.add(numero3);
    for (int i=0;i<lista.size();i++){
        System.out.println(i);
        for (int j=0;j<lista.size()-1 -i;j++){
            if (lista.get(j)>lista.get(j+1)){
                int temp = lista.get(j);
                lista.set(j,lista.get(j+1));
                lista.set(j+1,temp);
            }
            System.out.println(j);
        }
    }
    System.out.println(lista);

}

}

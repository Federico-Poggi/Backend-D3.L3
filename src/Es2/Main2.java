package Es2;

import Es2.sim.CallList;
import Es2.sim.Sim;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        {
            Sim sim;
            System.out.println("Inserisci il tuo numero di telefono, il nome, il cognome: \n");
            System.out.println("Inserisci nome:\n");
            String name=scanner.nextLine();
            System.out.println("Inserisci cognome:\n");
            String surname=scanner.nextLine();
            System.out.println("Inserisci numero di telefono:\n");
            String numero=( scanner.nextLine());
            sim=new Sim(name,surname,numero);
            System.out.println("Nome:" + sim.getName()+"\n" + " Surname:" + sim.getSurname() + "\n" + " Numero Cellulare:" + sim.getCellNumber());

        }
        CallList callList=new CallList();
        callList.GetNumberCalled();
        callList.GetDuration();
        System.out.println(callList.toString());

        }

    }


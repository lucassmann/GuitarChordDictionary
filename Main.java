/*
	Lucas Pereira Assmann e Gabriel Isdra Moszkowicz
	Fundamentos de Programação - Turma 138
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) //médoto main, que inicia com instruções para o usuário, scanner para leitura de input e cria um objeto Acorde, chamando também o método Acorde(String nomeInput).
    {
       
        System.out.println("Escolha um acorde para visualizar seu formato no violão. Digite uma das seguintes letras maiúsculas para selecionar um acorde: C, D, E, G ou A");
        Scanner scanner = new Scanner(System.in);
        GuitarChord scannedGuitarChord = new GuitarChord(scanner.next());
        scanner.close();
        scannedGuitarChord.print();
    }
}
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileScanner {
    public static void main(String[] args) throws Exception {

        File file = new File("d:\\in.txt"); // cria o arquivo
        Scanner sc = null;

        try {
            sc = new Scanner(file); // Ler o arquivo
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine()); // Ler as linhas no arquivo
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            if (sc != null) { // verifica se o scanner está aberto e, caso verdadeiro: fecha o scanner
                sc.close();
            }
        }

    }
}

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст и нажмите <Enter>");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: "+text.length());

       //Задание  к модулю 5.1: ввести путь к файлу в while(true)
        int quant=0;
        while (true){
            System.out.println("Введите путь до файла");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (fileExists != true || isDirectory == true){
                System.out.println("Путь указан не верно.");
                continue;
            }
            quant +=1;
            System.out.println("Путь указан верно. Это файл номер "+quant);
        }

    }
}

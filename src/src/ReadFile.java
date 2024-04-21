import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "file.txt";
        int tong = 0;
        int tongChan = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                tong += number;
                if (number % 2 == 0) {
                    tongChan += number;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Tổng các số trong file là: " + tong);
        System.out.println("Tổng các số chẵn trong file là: " + tongChan);
    }
}

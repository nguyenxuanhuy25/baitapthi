import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);

        // Xuất các phần tử chẵn
        System.out.print("Các phần tử chẵn trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Xuất các phần tử lẻ
        System.out.print("Các phần tử lẻ trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

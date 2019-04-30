import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        hienThi(size(scanner));
        nhap(scanner);
    }

    static void nhap(Scanner scanner) {
        System.out.print("Nhap kich thuoc ma tran \n");
        System.out.print("Nhap so dong n = \n");
        int n = scanner.nextInt();
        System.out.print("Nhap so cot m = \n");
        int m = scanner.nextInt();

        int[][] arr = nhapPhanTu(scanner, n, m);

        hienThi(n, m, arr);
        System.out.print("Nhap cot can tinh: ");
        int chonCot = scanner.nextInt();
        System.out.println("Tong gia tri cua cot " + chonCot + " la : " + tongCot(n, m, arr, chonCot));

    }

    static int[][] nhapPhanTu(Scanner scanner, int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Phan tu thu arr[%d][%d] : ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    static void hienThi(int n, int m, int[][] arr) {
        System.out.println("Ma tran : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int tongCot(int n, int m, int[][] arr, int c) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == c - 1) {
                    sum += arr[i][c - 1];
                }
            }
        }
        return sum;
    }
}

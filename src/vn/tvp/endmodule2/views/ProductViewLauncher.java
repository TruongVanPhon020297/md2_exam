package vn.tvp.endmodule2.views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductViewLauncher {
    public static void menuProduct() {
        System.out.println();
        System.out.println("* * * * --MENU PRODUCT-- * * * *     *");
        System.out.println("*                                    *");
        System.out.println("*    1. Xem danh sách                *");
        System.out.println("*    2. Thêm Mới                     *");
        System.out.println("*    3. Cập nhật                     *");
        System.out.println("*    4. Xóa                          *");
        System.out.println("*    5. Sắp xếp                      *");
        System.out.println("*    6. Tìm sản phẩm có giá đắt nhất *");
        System.out.println("*    7. Đọc từ file                  *");
        System.out.println("*    8. Ghi vào file                 *");
        System.out.println("*    9. Thoát                        *");
        System.out.println("*                                    *");
        System.out.println("* * * * * * * * * * * * * * * *      *");
    }
    public static void run() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();
            menuProduct();
            try {
                System.out.println("\nChọn chức năng: ");
                System.out.print("⭆ ");
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        productView.showProducts2(InputOption.SHOW);
                        break;
                    case 2:
                        productView.add();
                        break;
                    case 3:
                        productView.update();
                        break;
                    case 4:
                        productView.remove();
                        break;
                    case 5:
                        productView.sortProduct();
                        break;
                    case 6:
                        productView.showMaxPrice();
                        break;
                    case 7 :
                        System.out.println("Đọc từ file");
                        break;
                    case 8:
                        System.out.println("Ghi vào file");
                    case 9 :
                        System.out.println("Tạm biệt hẹn gặp lại !!!");
                        System.exit(1);
                    default:
                        System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        run();
                }
            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}

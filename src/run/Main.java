package run;

import entity.Shop;
import logic_handle.ShopLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int count = 0;
    public static ArrayList<Shop> shopManagement = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Nhập số lượng hàng muốn thêm: ");
        int num = new Scanner(System.in).nextInt();
        count += num;
        for (int i = 0; i < num; i++) {
            Shop shop = new Shop();
            shop.nhapThongTin();
            shopManagement.add(shop);
        }
        showMenu();
    }

    public static void showMenu() {
        menu();
        while (true){
            System.out.println("Chọn chức năng: ");
            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice > 0 && functionChoice < 7) {
                    break;
                }
                System.out.println("Chức năng không hợp lê, hãy nhập lại");
            }
            while (true);
            switch (functionChoice) {
                case 1:
                    ShopLogic.xemDanhSachSanPham();
                    break;
                case 2:
                    ShopLogic.timSpTheoTen();
                    break;
                case 3:
                    ShopLogic.timKiemTheoId();
                    break;
                case 4:
                    ShopLogic.timSpCoSoLuongNhoHon5();
                    break;
                case 5:
                    ShopLogic.timSpTheoMucGia();
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình");
                    return;
            }
        }
    }


    public static void menu() {
        System.out.println("----------QUẢN LÝ SẢN PHẨM CỬA HÀNG-----------");
        System.out.println("1. Xem danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo id");
        System.out.println("4. Tìm các sản phẩm có số lượng dưới 5");
        System.out.println("5. Tìm sản phẩm theo mức giá");
        System.out.println("6. Thoát chương trình");
    }
    }

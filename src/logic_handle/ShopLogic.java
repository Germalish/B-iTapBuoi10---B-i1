package logic_handle;

import entity.Shop;
import run.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopLogic {
    public static void xemDanhSachSanPham() {
        for (Shop i : Main.shopManagement) {
            System.out.println(i);
        }
    }

    public static void timSpTheoTen() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
        String name = new Scanner(System.in).nextLine();
        for (Shop i : Main.shopManagement) {
            if (i.getName() != null && i.getName().contains(name)) {
                System.out.println(i);
            } else {
                System.out.println("Không tìm thấy sản phẩm");
            }
            break;
        }
    }

    public static void timKiemTheoId() {
        System.out.println("Nhập ID sản phẩm muốn tìm kiếm: ");
        int id = new Scanner(System.in).nextInt();
        for (Shop i : Main.shopManagement){
            if (i.getId() == id){
                System.out.println(i);
                System.out.println("Đã xóa sản phẩm có id: " + id);
                Main.shopManagement.remove(i);
                System.out.println("Số sản phẩm còn lại: " + (Main.count -= 1));
            } else {
                System.out.println("Không tìm thấy sản phẩm");
            }
            break;
        }
    }

    public static void timSpCoSoLuongNhoHon5() {
        boolean thoaman = false;
        for (Shop i : Main.shopManagement){
            if (i.getNumber() < 5){
                System.out.println(i);
                thoaman = true;
            }
        }
        if (!thoaman){
            System.out.println("Không có sản phẩm có số lượng nhỏ hơn 5");
        }
    }

    public static void timSpTheoMucGia() {
        System.out.println("Nhập mức giá tìm kiếm sản phẩm: ");
        System.out.print("Từ: ");
        Long price1 = new Scanner(System.in).nextLong();
        System.out.print("Đến: ");
        Long price2 = new Scanner(System.in).nextLong();
        for (Shop i : Main.shopManagement){
            if (price1 < 50000 && i.getPrice() < 50000){
                System.out.println(i);
            } else if (price1 >= 50000 && price2 < 100000 && i.getPrice() >= 50000 && i.getPrice() < 100000) {
                System.out.println(i);
            } else if (price1 >= 100000  && i.getPrice() >= 100000) {
                System.out.println(i);
            }
        }
    }
}
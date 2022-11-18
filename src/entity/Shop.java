package entity;

import java.util.Scanner;

public class Shop {
    private int id;
    private String name;
    private String description;
    private int number;
    private long price;
    private String unit;
    public  static int Auto_Id = 100;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "entity.Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
    public void nhapThongTin(){
        this.id = Auto_Id;
        Auto_Id++;
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Mô tả sản phẩm: ");
        this.description = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng: ");
        this.number = new Scanner(System.in).nextInt();
        System.out.println("Nhập giá bán: ");
        this.price = new Scanner(System.in).nextLong();
        System.out.println("Nhập đơn vị trính: ");
        this.unit = new Scanner(System.in).nextLine();
    }
}

package qlks;
import java.util.Scanner;
public class sach {

    String maSach;
    String tensach;
    String nhaXuatBan;
    double donGia;
    int soLuong;
     
    public sach() {
        super();
    }
 
    public sach(String maSach,String tensach, String nhaXuatBan, double donGia, int soLuong ) {
        super();
        this.maSach = maSach;
        this.tensach=tensach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        
    }
 
    public String getMaSach() {
        return this.maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTensach() {
        return this.tensach;
    }
 
    public void setTensach(String tensach) {
        this.tensach=tensach;
    }
    public String getNhaXuatBan() {
        return this.nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public double getDonGia() {
        return this.donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return this.soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        tensach = scanner.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.println("Nhập số lượng: ");
        soLuong = scanner.nextInt();
        
    }
    
    public void hien()
{
System.out.print("{mã sách: "+ getMaSach() + ", tên sách: "+getTensach() +", nhà xb: "+ getNhaXuatBan()+ ", đơn giá: "+getDonGia() + "00"+"số lượng: "+getSoLuong()+"}");
}
}

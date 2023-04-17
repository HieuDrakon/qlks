package qlks;
import java.util.Scanner;
public class sach {

    String maSach;
    String tensach;
    String nhaXuatBan;
    double donGia;
    int soLuong;
    int ngn,tn,nn,ngx,tx,nx; 
    public sach() {
        super();
    }
 
    public sach(String maSach,String tensach, String nhaXuatBan, double donGia, int soLuong,int ngn,int tn,int nn,int ngx,int tx,int nx ) {
        super();
        this.maSach = maSach;
        this.tensach=tensach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngn = ngn;
        this.tn= tn;
        this.nn=nn;
        this.ngx=ngx;
        this.tx=tx;
        this.nx=nx;

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
    public int getNgn() {
        return this.ngn;
    }
 
    public void setNgn(int ngn) {
        this.ngn=ngn;
    }
    public int getTn() {
        return this.tn;
    }
 
    public void settn(int tn) {
        this.tn=tn;
    }
    public int getNn(){
        return nn;
    }
    public void setNn(int nn){
    this.nn=nn;
    }
    public int getNgx() {
        return this.ngx;
    }
 
    public void setNgx(int ngx) {
        this.ngx=ngx;
    }
    public int getTx() {
        return this.tx;
    }
 
    public void setTx(int tx) {
        this.tx=tx;
    }
    public int getNx(){
        return nx;
    }
    public void setNx(int nx){
    this.nx=nx;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.println("Nhập tên sách: ");
        tensach = scanner.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Nhập tháng nhập");
        tn = scanner.nextInt();
        if(tn <1 && tn > 12){
        do{
         System.out.println("nhập sai nhập lại");
         tn = scanner.nextInt();
          }while(tn>= 1 && tn <=12)
         } 
        System.out.println("Nhập ngày nhập");
        ngn = scanner.nextInt();
        while(tn%2==0){
        if(ngn<=0 && ngn > 31){
        do{
         System.out.println("nhập sai nhập lại");
         ngn = scanner.nextInt();
          }while(ngn>=1 && ngn <=31)
        }
        }
        while(tn%2!=0){
        if(ngn<=0 && ngn > 30){
        do{
         System.out.println("nhập sai nhập lại");
         ngn = scanner.nextInt();
          }while(ngn>=1 && ngn <=30)
        }
        }
        System.out.println("Nhập năm nhập");
        nn = scanner.nextInt();
        if(nn < 2023 && nn > 2123){
        do{
         System.out.println("nhập sai nhập lại");
         nn = scanner.nextInt();
          }while(nn>=2023 && nn <=2123)
        }
        System.out.println("Nhập tháng xuất");
        tx = scanner.nextInt();
        if(tx <1 && tx > 12){
        do{
         System.out.println("nhập sai nhập lại");
         tx = scanner.nextInt();
          }while(tx>= 1 && tx <=12)
         } 
        System.out.println("Nhập ngày xuất");
        ngx = scanner.nextInt();
        while(tx%2==0){
        if(ngx<=0 && ngx > 31){
        do{
         System.out.println("nhập sai nhập lại");
         ngx = scanner.nextInt();
          }while(ngn>=1 && ngn <=31)
        }
        }
        while(tn%2!=0){
        if(ngn<=0 && ngn > 30){
        do{
         System.out.println("nhập sai nhập lại");
         ngx = scanner.nextInt();
          }while(ngx>=1 && ngx <=30)
        }
        }
        System.out.println("Nhập năm xuất");
        nx = scanner.nextInt();
        if(nx < 2023 && nx > 2123){
        do{
         System.out.println("nhập sai nhập lại");
         nx = scanner.nextInt();
          }while(nx>=2023 && nx <=2123)
         }
        ngayxuat = scanner.nextLine();     
        System.out.println("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.println("Nhập số lượng: ");
        soLuong = scanner.nextInt();
        
    }
    
    public void hien()
{
System.out.println(" thời gian nhập"+getNn()"/"+getTn()"/"+getNn());
System.out.print("{mã sách: "+ getMaSach() + ", tên sách: "+getTensach() +", nhà xb: "+ getNhaXuatBan()+ ", đơn giá: "+getDonGia() + "00"+"số lượng: "+getSoLuong()+"ngày nhập"+getNgaynhap()+"ngày xuất"+getNgayxuat()+"}");
System.out.println(" thời gian xuất"+getNx()+"/"+getTx()+"/"+getNx());
}
}

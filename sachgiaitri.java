package qlks;
public class sachgiaitri extends sach{

public sachgiaitri() {
}
public sachgiaitri(String maSach, String tensach, String nhaXuatBan, double donGia, int soLuong,int ngn,int tn,int nn,int ngx, int tx, int nx) {
super(maSach, tensach, nhaXuatBan,donGia,soLuong,ngn,tn,nn,ngx,tx,nx);
}
@Override
public void hien()
{
System.out.println(" thời gian nhập"+getNn()"/"+getTn()"/"+getNn());
System.out.print("{mã sách: "+ getMaSach() + ", tên sách: "+getTensach() +", nhà xb: "+ getNhaXuatBan()+ ", đơn giá: "+getDonGia() + "00"+"số lượng: "+getSoLuong()+"ngày nhập"+getNgaynhap()+"ngày xuất"+getNgayxuat()+"}");
System.out.println(" thời gian xuất"+getNx()+"/"+getTx()+"/"+getNx());
}
}


/*
 * Tên người tạo: Lê Hồng Phúc
 * Ngày tạo: 03/03/2025
 * Mục đích: Tạo lớp nhân sự để quản lý thông tin Nhân sự cho các Lớp khác kế thừa 
 */

import java.util.ArrayList;

public abstract class NhanSu implements NhapXuat {
    //1.Attribute
    protected String maNV;

    protected String tenNV;
    protected String namSinh;
    protected String email;
    protected String soDienThoai;
    protected String maPhongBan;
    protected ArrayList <Task> dsTask;
    protected float luong;
    protected float soNgayLamViec;

    //2. get, set
    public void getMaNV(String maNV){
        this.maNV = maNV;
    }
    public String setMaNV(){
        return maNV;
    }

    public void getTenNV(String tenNV){
        this.tenNV = tenNV;
    }
    public String setTenNV(){
        return tenNV;
    }

    public void getNamSinh(String namSinh){
        this.namSinh = namSinh;
    }
    public String setNamSinh(){
        return namSinh;
    }

    public void getEmail(String email){
        this.email = email;
    }
    public String setEmail(){
        return email;
    }

    public void getSoDienThoai(String soDienThoai){
        this.soDienThoai = soDienThoai;
    }
    public String setSoDienThoai(){
        return soDienThoai;
    }

    public void getMaPhongBan(String maPhongBan){
        this.maPhongBan = maPhongBan;
    }
    public String setMaPhongBan(){
        return maPhongBan;
    }

    public void getDsTask(ArrayList <Task> dsTask){
        this.dsTask = dsTask;
    }
    public ArrayList <Task> setDsTask(){
        return dsTask;
    }

    public void getSoNgayLamViec(float soNgayLamViec){
        this.soNgayLamViec = soNgayLamViec;
    }
    public float setSoNgayLamViec(){
        return soNgayLamViec;
    }

    //3. Constructor
    public NhanSu(){
        this.maPhongBan = "0";
    }

    public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.maPhongBan = "0";
    }

    public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai, String maPhongBan, float soNgayLamViec){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.maPhongBan = maPhongBan;
        this.soNgayLamViec = soNgayLamViec;
    }

    //4. Input, Output
    public void xuat(){
        String temp = this.maPhongBan;

        if(this.maPhongBan.equalsIgnoreCase("0")){
            temp = "Chua phan bo";
        }
        System.out.println("Ma: " + this.maNV + "Ten: " + this.tenNV + " Nam sinh: " + this.namSinh 
        + " Email: " + this.email + " So dien thoai: " + this.soDienThoai 
        + " Ma phong ban: " +temp + "So ngay lam viec: " + this.soNgayLamViec 
        + "Luong: " + this.luong);
    }

    //5. Bussiness methods
    public abstract void tinhLuong();
}

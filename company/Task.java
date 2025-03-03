/*
 * Người tạo: Lê Hồng Phúc
 * Ngày tạo: 03/03/2025
 * Mục đích: Quản lý công việc liên quan đến Task cho Nhân viên
 */

public class Task implements NhapXuat{

    //1. Attributes
    private String maTask;
    private String tenTask;
    private float gioThucHien;
    String maNV;

    //2. Get, Set
    public void getMaTask(String maTask){
        this.maTask = maTask;
    }
    public String setMaTask(){
        return maTask;
    }

    public void getTenTask(String tenTask){
        this.tenTask = tenTask;
    }
    public String setTenTask(){
        return tenTask;
    }

    public void getGioThucHien(float gioThucHien){
        this.gioThucHien = gioThucHien;
    }
    public float setGioThucHien(){
        return gioThucHien;
    }

    public void getMaNV(String maNV){
        this.maNV = maNV;
    }
    public String setMaNV(){
        return maNV;
    }

    //3. Contructor
    public Task(){
        this.maNV = "0";
    }

    public Task(String maTask, String tenTask, float gioThucHien, String maNV){
        this.maTask = maTask;
        this.tenTask = tenTask;
        this.gioThucHien = gioThucHien;
        this.maNV = maNV;
    }

    //4. Input, Output
    public void xuat(){
        System.out.println("Ma: " + this.maTask + " Ten Task: " + this.tenTask + " Gio thuc hien: " + this.gioThucHien);
    }


}
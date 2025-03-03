/*
 * Người tạo: Lê Hồng Phúc
 * Ngày tạo: 03/03/2025
 * Mục đích: Quản lý Nhân viên thường
 */

public class NhanVienThuong extends NhanSu {
    final int LUONG_NGAY = 500000;
    final int PHU_CAP_1 = 250000;
    final int PHU_CAP_2 = 200000;
    
    //1. Attribute
    //2. Get, set
    //3. Constructor
        public NhanVienThuong(){
            super();
        }

        public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDienThoai, String maPhongBan, float soNgayLamViec){
            super(maNV, tenNV, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
        }

    //4. Input, output
    //5. Bussiness methods
    @Override
    public void tinhLuong() {

    }
}

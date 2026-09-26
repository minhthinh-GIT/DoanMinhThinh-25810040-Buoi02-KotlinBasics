// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Đặt bàn thành công! Khách hàng: $tenKhachHang | Số lượng: $soLuongKhach người | Loại bàn: $loaiBan")
}

fun main() {
    datBan("Nguyễn Văn A", 4)
    datBan("Trần Thị B", 2, "Bàn VIP")
    datBan(soLuongKhach = 6, tenKhachHang = "Lê Văn C", loaiBan = "Bàn ngoài trời")
}
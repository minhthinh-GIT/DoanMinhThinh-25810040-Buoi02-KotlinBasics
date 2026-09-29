// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

class TaiKhoanNganHang(val soTaiKhoan: String, val soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản thành công. Số dư: $soDuBanDau")
        }
    }
}

fun main() {
    println("TẠO TÀI KHOẢN 1")
    val tk1 = TaiKhoanNganHang("TK123456", 500000.0)

    println()

    println("THỬ TẠO TÀI KHOẢN 2 (số dư âm)")
    val tk2 = TaiKhoanNganHang("TK999999", -100000.0)
}
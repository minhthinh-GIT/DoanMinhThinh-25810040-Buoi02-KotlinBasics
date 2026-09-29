// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

class TaiKhoanNganHang(val soTaiKhoan: String, var soDu: Double) {

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nạp thành công $soTien ")
        } else {
            println("Số tiền nạp không hợp lệ")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien
            println("Rút thành công $soTien ")
            return true
        } else {
            println("Rút thất bại. Số dư không đủ hoặc số tiền không hợp lệ")
            return false
        }
    }
}

fun main() {
    val tk = TaiKhoanNganHang("TK123456", 1000000.0)
    println("SỐ DƯ BAN ĐẦU: ${tk.soDu} ")

    println("\nNẠP TIỀN")
    tk.napTien(500000.0)
    println("Số dư hiện tại: ${tk.soDu}")

    println("\nRÚT TIỀN HỢP LỆ")
    tk.rutTien(300000.0)
    println("Số dư hiện tại: ${tk.soDu}")

    println("\nRÚT QUÁ SỐ DƯ")
    tk.rutTien(2000000.0)
    println("Số dư hiện tại: ${tk.soDu} ")
}
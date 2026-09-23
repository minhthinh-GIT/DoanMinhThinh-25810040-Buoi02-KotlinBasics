// Họ tên: Đoàn Minh Thịnh - MSSV: 25810040
fun main() {
    val soDuBanDau: Int = 5000000
    var soDuHienTai: Int = soDuBanDau
    println("Số dư ban đầu: $soDuBanDau VNĐ")

    val tienGui: Int = 2000000
    soDuHienTai = soDuHienTai + tienGui
    println("Gửi thêm $tienGui VNĐ, số dư hiện tại: $soDuHienTai VNĐ")

    val tienRut: Int = 1500000
    soDuHienTai = soDuHienTai - tienRut
    println("Rút $tienRut VNĐ, số dư hiện tại: $soDuHienTai VNĐ")
}
//Chọn val cho biến số dư ban đầu vì đây là hằng số không đổi, dùng để lưu giá trị ban đầu 
//Chọn var cho biến số dư hiện tại vì đây là biến số, giá trị phải cập nhật liên tục sau mỗi giao dịch

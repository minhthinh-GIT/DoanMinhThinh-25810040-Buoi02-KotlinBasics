// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun ghiNhatKyExplicit(hanhDong: String): Unit {
    println("[LOG]: $hanhDong")
}

fun ghiNhatKyImplicit(hanhDong: String) {
    println("[LOG]: $hanhDong")
}

fun main() {
    ghiNhatKyExplicit("Người dùng đăng nhập hệ thống")
    ghiNhatKyImplicit("Người dùng cập nhật mật khẩu")
}

/*
  Unit đại diện cho hàm không trả về giá trị hữu ích. Nếu không khai báo kiểu trả về, Kotlin sẽ tự động hiểu mặc định hàm đó trả về Unit nên hai cách viết trên là hoàn toàn tương đương nhau.
*/
// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun main() {
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val danhSachNhanDoi = danhSachSo.map { it * 2 }

    println("Biến đổi danh sách bằng map")
    println("Danh sách ban đầu: $danhSachSo")
    println("Danh sách sau khi nhân đôi: $danhSachNhanDoi")

    println() // In dòng trống cho dễ nhìn

    val danhSachLongNhau = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8)
    )
    val danhSachPhang = danhSachLongNhau.flatten()

    println("Gộp danh sách lồng nhau bằng flatten")
    println("Danh sách lồng nhau: $danhSachLongNhau")
    println("Danh sách sau khi gộp phẳng: $danhSachPhang")
}
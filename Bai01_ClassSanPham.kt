// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("Điện thoại Samsung", 15000000.0, 10)
    val sp2 = SanPham(
        tenSanPham = "Tai nghe Bluetooth",
        gia = 500000.0
    )

    println("SẢN PHẨM 1")
    println("Tên: ${sp1.tenSanPham}")
    println("Giá: ${sp1.gia}")
    println("Tồn kho: ${sp1.soLuongTonKho}")

    println()

    println("SẢN PHẨM 2")
    println("Tên: ${sp2.tenSanPham}")
    println("Giá: ${sp2.gia}")
    println("Tồn kho: ${sp2.soLuongTonKho}")
}
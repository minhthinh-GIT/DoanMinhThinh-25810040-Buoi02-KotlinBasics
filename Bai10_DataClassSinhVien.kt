// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sv1 = SinhVien("25810040", "Đoàn Minh Thịnh", 8.5)
    val sv2 = SinhVien("25810040", "Đoàn Minh Thịnh", 8.5)

    println("1. kiểm tra toString tự sinh")
    println("Thông tin sv1: $sv1")

    println("\n2. kiểm tra equals tự sinh với toán tử ==")
    println("sv1 == sv2: ${sv1 == sv2}")
    println("\n3. bản sao hàm copy")
    
    val sv3 = sv1.copy(diemTrungBinh = 9.0)
    println("Thông tin sv3 (sau khi copy và cải thiện điểm): $sv3")
}
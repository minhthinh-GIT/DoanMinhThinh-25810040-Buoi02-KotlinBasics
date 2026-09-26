// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun dinhDangDiaChi(
    soNha: String,
    duong: String,
    phuongXa: String = "Phường Bến Nghé",
    quanHuyen: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha $duong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi(
        soNha = "123",
        duong = "Lê Lợi"
    )
    println("Địa chỉ 1: $diaChi1")

    val diaChi2 = dinhDangDiaChi(
        soNha = "456",
        duong = "Nguyễn Huệ",
        quanHuyen = "Quận 2"
    )
    println("Địa chỉ 2: $diaChi2")
}
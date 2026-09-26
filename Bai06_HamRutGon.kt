// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun binhPhuongFull(n: Int): Int {
    return n * n
}
fun binhPhuongShort(n: Int): Int = n * n


fun chuViHinhVuongFull(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongShort(canh: Double): Double = canh * 4


fun laSoChanFull(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanShort(n: Int): Boolean = n % 2 == 0


fun main() {
    println("Bình phương của 5")
    println("Bản đầy đủ: ${binhPhuongFull(5)}")
    println("Bản rút gọn: ${binhPhuongShort(5)}")

    println("Chu vi hình vuông cạnh 4.5")
    println("Bản đầy đủ: ${chuViHinhVuongFull(4.5)}")
    println("Bản rút gọn: ${chuViHinhVuongShort(4.5)}")

    println("Kiểm tra số 6 có phải số chẵn")
    println("Bản đầy đủ: ${laSoChanFull(6)}")
    println("Bản rút gọn: ${laSoChanShort(6)}")
}
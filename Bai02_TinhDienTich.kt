// Họ và tên: Đoàn Minh Thịnh - 25810040

fun tinhDienTich(CD: Double, CR: Double): Double {
    return CD * CR
}

fun main() {
    val dt1 = tinhDienTich(10.5, 5.0)
    println("Diện tích HCN 1 (10.5 x 5.0): $dt1")

    val dt2 = tinhDienTich(7.2, 3.4)
    println("Diện tích HCN 2 (7.2 x 3.4): $dt2")
}
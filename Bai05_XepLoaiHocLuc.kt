// Họ tên: Đoàn Minh Thịnh - MSSV: 25810040
fun main() {
    val diemTB: Double = 8.3
    val xepLoai: String = when (diemTB) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.49 -> "Giỏi"
        in 5.5..6.99 -> "Khá"
        in 4.0..5.49 -> "Trung bình"
        in 0.0..3.99 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTB")
    println("Xếp loại: $xepLoai")
}

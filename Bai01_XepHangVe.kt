// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

fun main() {
    val tuoi: Int = 10

    val loaiVe: String = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi >= 60) {
        "Vé cao tuổi"
    } else {
        "Vé người lớn"
    }

    println("Tuổi: $tuoi")
    println("Vé: $loaiVe")
}
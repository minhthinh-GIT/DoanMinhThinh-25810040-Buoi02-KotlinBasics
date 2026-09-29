// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int
    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là: $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 100
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 180
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    print("Xe máy: ")
    xeMay.moTa()

    print("Ô tô: ")
    oTo.moTa()
}
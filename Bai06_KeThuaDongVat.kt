// Họ và tên: Đoàn Minh Thịnh - MSSV: 25810040

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Động vật phát ra tiếng kêu"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat: List<DongVat> = listOf(
        Cho("Chó"),
        Meo("Mèo ")
    )

    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten}: ${dongVat.keu()}")
    }
}
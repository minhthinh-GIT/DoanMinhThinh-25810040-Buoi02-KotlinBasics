// Họ tên: Đoàn Minh Thịnh - MSSV: 25810040
fun main() {
    val danhSachSach = mutableListOf(
        "Doraemon",
        "Conan",
        "Shin",
        "Dragon Ball",
        "Naruto"
    )

    println("danh sách ban đầu")
    for (sach in danhSachSach) {
        println("- $sach")
    }

    danhSachSach.add("One Piece")
    danhSachSach.add("HxH")
    danhSachSach.remove("One Piece")
    danhSachSach.sort()

    println("danh sách sau")
    for (sach in danhSachSach) {
        println("- $sach")
    }
}

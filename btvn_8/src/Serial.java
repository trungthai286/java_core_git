public class Serial extends Film {

    public int soTap;
    public String thoiLuongTB;

    public Serial(int id, String tieuDe, String theLoai, String daoDien, String ngayCongChieu, int soTap, String thoiLuongTB) {
        super(id, tieuDe, theLoai, daoDien, ngayCongChieu);
        this.soTap = soTap;
        this.thoiLuongTB = thoiLuongTB;
    }

    @Override
    public String toString() {
        return "Serial: (" +
                "soTap: " + soTap +
                ", thoiLuongTB: " + thoiLuongTB +
                ") " + super.toString();
    }
}

package bai1.vnua.fita;

public class PhanSo {
	int ts;
	int ms;
	
	//Khoi tao phan so co tu = 0, mau = 1
	public PhanSo() {
		ts = 0;
		ms = 1;
	}
	
	//Khoi tao phan so
	public PhanSo(int ts, int ms) {
		this.ts = ts;
		this.ms = ms;
	}
	
	//Phuong thuc kiem tra phan so toi gian
	public boolean ktToiGian() {
	    return UCLN(this.ts, this.ms) == 1;
	}
	
	//Phuong thuc cong phan so
	public PhanSo congPS(PhanSo ps) {
		int tsm = this.ts*ps.ms + this.ms*ps.ts;
		int msm = this.ms*ps.ms;
		return new PhanSo(tsm,msm);
	}
	
	//Phuong thuc tim ucln	
	public int UCLN(int ts, int ms) {
		if (ms == 0) return ts;
		return UCLN(ms, ts % ms);
	}
	
	//Phuong thuc rut gon phan so
	public PhanSo rutGonPS() {
		int UCLN = UCLN(this.ts, this.ms);
		int tsm = this.ts / UCLN;
		int msm = this.ms / UCLN;
		return new PhanSo(tsm,msm);
	}
	
	public String inPS() {
	    if (ts == 0) return "0";
	    if (ms == 1) return ts + "";
	    if (ms < 0) return (-ts) + "/" + (-ms); // chuẩn hóa mẫu dương
	    return ts +"/"+ms;
	}

	
	public static void main(String[] args) {
        // Tạo phân số dùng constructor không tham số
        PhanSo ps1 = new PhanSo();
        ps1.inPS();

        // Tạo phân số 3/5
        PhanSo ps2 = new PhanSo(3,5);
        ps2.inPS();

        // Tạo phân số 8/18
        PhanSo ps3 = new PhanSo(8,18);
        ps3.inPS();

        // Tính tổng ps2 + ps3
        PhanSo pst = ps2.congPS(ps3);
        System.out.print("Tổng ps2 + ps3 = ");
        System.out.println(pst.inPS());
        
        // Rút gọn ps2
        PhanSo psrg = ps2.rutGonPS();
        System.out.print("Phân số ps2 sau khi rút gọn = ");
        System.out.print(psrg.inPS());
    }
}

	

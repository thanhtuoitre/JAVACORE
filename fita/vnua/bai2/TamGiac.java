package fita.vnua.bai2;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	
	//Constructor khoi tao tam giac
	public TamGiac() {
		
	}
	
	//Constructor khoi tao tam giac co 3 diem
	public TamGiac(Diem A,Diem B,Diem C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	//Tinh chu vi tam giac
	public float chuVi() {
		//Tinh kc 3 canh
		float AB = A.kc(B);
		float AC = A.kc(C);
		float BC = B.kc(C);
		
		return AB + AC + BC;
	}
	
	//Tinh dien tich tam giac
	public float dienTich() {
		//Tinh kc 3 canh
		float AB = A.kc(B);
		float CA = C.kc(A);
		float BC = B.kc(C);
		
		float p = (AB + BC + CA)/2;
		
		return (float) Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
	}
}

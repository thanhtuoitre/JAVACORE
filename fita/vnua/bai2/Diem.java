package fita.vnua.bai2;

public class Diem {
	private float x,y;
	
	//Ham khoi tao diem
	public Diem() {
		
	}
	
	//Ham khoi tao diem co tham so
	public Diem(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	//Ham tinh khoang cach 2 diem
	public float kc(Diem d) {
		float kc = (float) Math.sqrt((this.x - d.x)*(this.x - d.x) + (this.y - d.y)*(this.y - d.y));
		return kc;
	}
	
	//Ham in diem
	public void inDiem() {
		System.out.println("x:"+ x +"y:"+ y );
	}
}

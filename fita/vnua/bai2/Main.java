package fita.vnua.bai2;

public class Main {
		class TestTG {
			public static void main(String[] args) {
				Diem A = new Diem();
				Diem B = new Diem(3, 0);
				Diem C = new Diem(0, 4);

				// Tao tam giac ABC
				TamGiac tg = new TamGiac(A, B, C);
				// In ra dien tich tam giac
				System.out.println("Dien tich tam giac la: " + tg.dienTich());
				// In ra chu vi tam giac
				System.out.println("Chu vi tam giac la: " + tg.chuVi());
			}
		}

	}


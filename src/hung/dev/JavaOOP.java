package hung.dev;

public class JavaOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String arrName[]= {"Huy","Bao","Quan","Dat","Sinh"};
		final double arrdiemtoan[]= {7,8,7,9,6};
		final double arrdiemly[]= {8,10,9,8,9};
		final double arrdiemhoa[]= {6,8,7,8,9};
		SinhVien arrSinhVien[]= new SinhVien[arrName.length];
		for(int i=0;i<arrSinhVien.length;i++) {
			SinhVien sv= new SinhVien(arrName[i],arrdiemtoan[i],arrdiemly[i],arrdiemhoa[i]);
			arrSinhVien[i]=sv;
		}
		for(int i=0;i<arrSinhVien.length;i++) {
			if(arrSinhVien[i].diemTrungBinh(arrdiemtoan[i],arrdiemly[i],arrdiemhoa[i])>8) {
				arrSinhVien[i].show();
			}
		}
	}
}
	



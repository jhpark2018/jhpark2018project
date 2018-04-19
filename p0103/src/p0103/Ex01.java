package p0103;

class Student{
	String hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	void hap(String h_No,String name1,int kor1,int eng1,int mat1) {
		hakbun=h_No;
		name = name1;
		kor =  kor1;
		eng = eng1;
		mat = mat1;
		sum = kor+eng+mat;
	}
	void avg() {		
		avg = (float)sum / 3;	
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.hap("20170001", "이순신", 90, 80, 100);
		stu1.avg();
		System.out.println("학번 : "+stu1.hakbun);
		System.out.println("이름 : "+stu1.name);
		System.out.println("국어 : "+stu1.kor);
		System.out.println("영어 : "+stu1.eng);
		System.out.println("수학 : "+stu1.mat);
		System.out.println("합계 : "+stu1.sum);
		System.out.println("평균 : "+stu1.avg);






	}

}

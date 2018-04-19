package p0103;
class Student1{
	String hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	void hap() {
		sum = kor+eng+mat;
	}
	void avg() {		
		avg = (float)sum / 3;	
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		stu1.hakbun="20170001";
		stu1.name="홍길동";
		stu1.kor=90;
		stu1.eng=89;
		stu1.mat=100;
		stu1.hap();
		stu1.avg();
		Student1 stu2 = new Student1();
		stu2.hakbun="20170002";
		stu2.name="이순신";
		stu2.kor=70;
		stu2.eng=87;
		stu2.mat=80;
		stu2.hap();
		stu2.avg();
		System.out.println("학번 : "+stu1.hakbun);
		System.out.println("이름 : "+stu1.name);
		System.out.println("국어 : "+stu1.kor);
		System.out.println("영어 : "+stu1.eng);
		System.out.println("수학 : "+stu1.mat);
		System.out.println("합계 : "+stu1.sum);
		System.out.println("평균 : "+stu1.avg);
		
		System.out.println("학번 : "+stu2.hakbun);
		System.out.println("이름 : "+stu2.name);
		System.out.println("국어 : "+stu2.kor);
		System.out.println("영어 : "+stu2.eng);
		System.out.println("수학 : "+stu2.mat);
		System.out.println("합계 : "+stu2.sum);
		System.out.println("평균 : "+stu2.avg);






	}

}

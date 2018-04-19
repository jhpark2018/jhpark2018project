package p0103;
class coffee{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	String name;
	int price;
	void print(){
		System.out.println("종류 : "+name+" 가격 : "+price);
	}
}
public class Ex03 {

	public static void main(String[] args) {
		coffee coff1 = new coffee();
		coff1.name="아메리카노";
		coff1.price=2000;
		coff1.print();
		System.out.println("종류 : "+coff1.getName()+" 가격 : "+coff1.getPrice());
		coff1.setName("카푸치노");
		coff1.setPrice(4500);
		System.out.println("종류 : "+coff1.getName()+" 가격 : "+coff1.getPrice());
	}

}

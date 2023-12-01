package generics;

class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}  
public class TestGenericClass {

	public static void main(String[] args) {
		MyGen<Integer> gen=new MyGen<Integer>();
		gen.add(100);
		System.out.println(gen.get());

	}

}

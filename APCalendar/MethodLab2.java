public class MethodLab2 {
	
	public static void forloop(int start,int stop,int increment){
		for (int i=start; i<stop; increment++){
			System.out.println(i);
		}
	}
	public static void whileloop(int number){
		int count = 0;
		int sum = 0;
		while (number > 0) {
			sum += number % 10
		} 
		
	}
	public static void addHypen(String stuff){
		System.out.println(stuff.replace(" ","-"));
	}
	public static void main(String[] args){
		forloop(2, 10, 2);
		forloop(3, 10, 2);
		forloop(4, 10, 2);
		whileloop(234);
		addHypen("hello world");
	}
}

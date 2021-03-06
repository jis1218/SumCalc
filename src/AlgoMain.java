
public class AlgoMain {

	public static void main(String[] args) {
		
		AlgoMain algo = new AlgoMain();
		
		long evenResult = algo.even(100L);
		long oddResult = algo.odd(4L);
		long allResult = algo.all(100L);
		System.out.println(evenResult);
		System.out.println(oddResult);
		System.out.println(allResult);
		
		
	}
	
	public long all(long max){
		
		long total = max*(max+1)/2;
		
		return total;
				
	}
	
	public long even(long max){
		
		long num = max/2; //max가 짝수이든 홀수이든 max의 순번은 max/2로 구할 수가 있음
		
		long total = num*(num+1);
		
		return total;

	}
	
	public long odd(long max){
		
		long num = (max+1)/2; //max가 짝수이든 홀수이든 max의 순번은 (max+1)/2로 구할 수가 있음
		
		long total = num*num;
		
		return total;
	}

}

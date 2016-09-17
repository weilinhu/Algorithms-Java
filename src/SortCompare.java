import sort.SortUtils;


/**
 * 排序时间对比类
 * @author Administrator
 *
 */
public class SortCompare {

	public static double time(String alg,Double[] a){
		SortUtils.show(a);
		StopWatch timer = new StopWatch();
		if(alg.equals("Insertion")){
			Insertion.sort(a);
		}
		
		if(alg.equals("Selection")){
			Selection.sort(a);
		}
		if(alg.equals("Shell")){
			Shell.sort(a);
		}
		if(alg.equals("Merge")){
			Merge.sort(a);
		}
		if(alg.equals("Quick")){
			Quick.sort(a);
		}
		if(alg.equals("Heap")){
			Heap.sort(a);
		}
//		SortUtils.show(a);
//		SortUtils.isSorted(a);
		
		return timer.elapsedTime();
	}
	
	public static double timeRandomInput(String alg,int N,int T){
		//使用此算法alg将T个长度为N的数组排序
		
		double total =0.0;
		Double[] a =new Double[N];
		for(int t =0;t<N;t++){
			//进行一次测试，生成一个数组并排序

			for(int i =0;i<N;i++){
				a[i] = StdRandom.uniform(); 
			}
			
			total +=time(alg,a);
		}
		return total;
		
	}
	
	public static void main (String[] args){
//		
//		double t1 = timeRandomInput("Insertion",1000,100);
//		double t2 = timeRandomInput("Selection",1000,100);
//		double t3= timeRandomInput("Shell",1000,100);
//		double t4= timeRandomInput("Merge",1000,100);
//		double t5= timeRandomInput("Quick",1000,100);
//		double t6= timeRandomInput("Heap",1000,100);
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
//		System.out.println(t4);
//		System.out.println(t5);
//		System.out.println(t6);
	}
	
	
	
	
	
	
}

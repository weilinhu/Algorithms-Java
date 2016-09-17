import sort.SortUtils;

public class Heap {


	public static void sort(Comparable[] a){
		int N = a.length;
		for (int k = N/2;k>=1;k--){
			sink(a,k ,N);
			
		}
		while (N >1){
			SortUtils.exch(a, 1, N--);
			sink(a,1,N);
			
		}
		
		
	}
	
	
	private static void sink(Comparable[]a ,int k,int N ){
		while(2*k <=N){
			int j = 2*k;
			if(j<N&& SortUtils.less(a[j-1], a[j])){
				j++;
			}
			if(!SortUtils.less(a[k], a[j])){
				break;
			}
			SortUtils.exch(a, k, j);
			k = j;
			
			
		}
		
		
	}
}

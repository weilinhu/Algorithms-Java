import sort.SortUtils;

/**
 * 
 * 算法稳定
 * 插入排序
 * @author Administrator
 *
 */
public class Insertion {

	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i=1;i<N;i++){
			//将a[i]插入到前面a[i-1]
			
			for(int j= i;j>0&&SortUtils.less(a[j],a[j-1]);j--){
				SortUtils.exch(a,j,j-1);
			}
		}
	}
	
	public static void Bsort(Comparable[] a){
		
		int N = a.length;
		for(int i=N;i>=0;i--){
			//将a[i]插入到前面a[i-1]
			
			for(int j= i;j<N-1&&SortUtils.less(a[j+1],a[j]);j++){
				SortUtils.exch(a,j,j+1);
			}
		}
		
		
		
	}
	
	
	
	
}

import sort.SortUtils;

/**
 * 选择排序
 * @author Administrator
 *
 */
public class Selection {

	public static void sort(Comparable[] a){
	//将a[]按升序排列
		
		int N = a.length;
		for(int i = 0;i < N ; i++){
			int min = i ;
			for (int j = i+1;j<N ;j++){
				if(SortUtils.less(a[i],a[min])){
					SortUtils.exch(a,i,min);
				}	
			}	
		}
	}
}

import sort.SortUtils;

/**
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
}

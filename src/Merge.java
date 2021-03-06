import sort.SortUtils;

public class Merge {
	
	private static Comparable[] aux; //归并所需的辅助数组
	

	public static void sort(Comparable[] a) {

		aux = new Comparable[a.length];
		sort(a,0,a.length-1);
		
	}

	private static void sort(Comparable[]a ,int lo,int hi){
		//将数组a[lo,hi]排序
		if(hi<=lo){
			return;
		}
		int mid =lo +(hi-lo)/2;
		
		sort(a,lo,mid);//左半边排序
		
		sort(a,mid+1,hi);//右半边排序
		
		merge(a,lo,mid,hi);
		
		
		
		
	}
	
	
	/**
	 * 原地归并
	 * 
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		// 将a[lo..min]和a[mid+1..hi]归并
		
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		// 归并回到a[lo..hi]
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (SortUtils.less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}

	}

}

import sort.SortUtils;

public class Merge {
	
	private static Comparable[] aux; //�鲢����ĸ�������
	

	public static void sort(Comparable[] a) {

		aux = new Comparable[a.length];
		sort(a,0,a.length-1);
		
	}

	private static void sort(Comparable[]a ,int lo,int hi){
		//������a[lo,hi]����
		if(hi<=lo){
			return;
		}
		int mid =lo +(hi-lo)/2;
		
		sort(a,lo,mid);//��������
		
		sort(a,mid+1,hi);//�Ұ������
		
		merge(a,lo,mid,hi);
		
		
		
		
	}
	
	
	/**
	 * ԭ�ع鲢
	 * 
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		// ��a[lo..min]��a[mid+1..hi]�鲢
		
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		// �鲢�ص�a[lo..hi]
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

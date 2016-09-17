import sort.SortUtils;

/**
 * ѡ������
 * 
 * @author Administrator
 *
 */
public class Selection {

	public static void sort(Comparable[] a) {
		// ��a[]����������

		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				
				if (SortUtils.less(a[i], a[min])) {
					SortUtils.exch(a, i, min);
				}
			}
		}
	
	}

	/**
	 * ð������
	 * 
	 * �㷨�ȶ�
	 * @param a
	 */
	public static void BubbleSort(Comparable[] a) {
		int N = a.length;

		for (int i = N - 1; i > 0; i--) {
			int flag = 0 ;
			for (int j = 0; j < i ; j++) {

				if (SortUtils.less(a[j+1], a[j])) {
					flag =1;
					SortUtils.exch(a, j, j+1);
				}
			}
			if(flag ==0){
				break; //ȫ���޽������Ѿ�����
			}
		}
	}

}

import sort.SortUtils;

public class Quick {


	public static void sort(Comparable[] a){
		StdRandom.shuffle(a);
		sort(a,0,a.length -1);
	}
	
	
	private static void sort(Comparable[] a,int lo,int hi ){
		
		if(hi<=lo){
			return;
		}
		int j = partition(a,lo,hi);	//	�з�
				
		sort(a,lo,j-1);
		sort(a,j+1,hi);
		
	}


	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j =hi+1; 	//����ɨ��ָ��
		Comparable v =a[lo];
		
		while(true){
			//ɨ�����ң����ɨ���Ƿ����������Ԫ��  , ���ɨ���������ڵ����з�Ԫ��ֵ��Ԫ��ʱͣ��
			while(SortUtils.less(a[++i], v)){
				//ѭ��ֻҪm,i��v�ͼ���ѭ������v��,�Ͳ������ѭ��������ִ��
				if(i == hi){
					break;
				}
			}
			
//			�Ҳ�ɨ������С�ڵ����з�Ԫ��ֵ��Ԫ��ʱͣ��
			while(SortUtils.less(v, a[--j])){
				//ֻ���Ҳ��v��ͼ���ִ��,
				if (j == lo ){
					break;
				}
				
			}
			//ִ�е����ʱ��a[i] > v > a[j],��Ӧ�ý���Ԫ��
			
			if (i >= j){
				break;
			}
			
			SortUtils.exch(a, i, j);
			
		}
		
		SortUtils.exch(a, lo, j);//�� v =a[j] ������ȷ��λ��
		
		return j;
	}
	
}

import sort.SortUtils;

public class Shell {

	

	public static void sort(Comparable[] a){
		
		int N = a.length;
		int h =1;
		
		while(h<N/3){
			h = 3*h+1;
		}
		while (h>=1){
			//������h��Ϊ����
			for(int i =h;i<N;i++){
				//��a[i]���뵽a[i-h],a[i-2*h],a[i-3h]...֮��
				for(int j =i;j>=h&&(SortUtils.less(a[j], a[j-h]));j -=h){
					SortUtils.exch(a, j, j-h);
				}
				
			}
			h=h/3;
			
		}
		
	}
}

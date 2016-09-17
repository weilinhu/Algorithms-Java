import sort.SortUtils;

public class Shell {

/*	void ShellSort( ElementType A[], int N )
	{  ϣ������ - ��Sedgewick�������� 
	     int Si, D, P, i;
	     ElementType Tmp;
	      ����ֻ�г�һС�������� 
	     int Sedgewick[] = {929, 505, 209, 109, 41, 19, 5, 1, 0};
	      
	     for ( Si=0; Sedgewick[Si]>=N; Si++ ) 
	         ;  ��ʼ������Sedgewick[Si]���ܳ����������г��� 
	 
	     for ( D=Sedgewick[Si]; D>0; D=Sedgewick[++Si] )
	         for ( P=D; P<N; P++ ) {  ��������
	             Tmp = A[P];
	             for ( i=P; i>=D && A[i-D]>Tmp; i-=D )
	                 A[i] = A[i-D];
	             A[i] = Tmp;
	         }
	}*/

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

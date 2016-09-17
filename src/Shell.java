import sort.SortUtils;

public class Shell {

/*	void ShellSort( ElementType A[], int N )
	{  希尔排序 - 用Sedgewick增量序列 
	     int Si, D, P, i;
	     ElementType Tmp;
	      这里只列出一小部分增量 
	     int Sedgewick[] = {929, 505, 209, 109, 41, 19, 5, 1, 0};
	      
	     for ( Si=0; Sedgewick[Si]>=N; Si++ ) 
	         ;  初始的增量Sedgewick[Si]不能超过待排序列长度 
	 
	     for ( D=Sedgewick[Si]; D>0; D=Sedgewick[++Si] )
	         for ( P=D; P<N; P++ ) {  插入排序
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
			//将数组h变为有序
			for(int i =h;i<N;i++){
				//将a[i]插入到a[i-h],a[i-2*h],a[i-3h]...之中
				for(int j =i;j>=h&&(SortUtils.less(a[j], a[j-h]));j -=h){
					SortUtils.exch(a, j, j-h);
				}
				
			}
			h=h/3;
			
		}
		
	}
}

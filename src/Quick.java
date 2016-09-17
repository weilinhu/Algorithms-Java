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
		int j = partition(a,lo,hi);	//	切分
				
		sort(a,lo,j-1);
		sort(a,j+1,hi);
		
	}


	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j =hi+1; 	//左右扫描指针
		Comparable v =a[lo];
		
		while(true){
			//扫描左右，检查扫描是否结束并交换元素  , 左侧扫描遇到大于等于切分元素值的元素时停下
			while(SortUtils.less(a[++i], v)){
				//循环只要m,i比v就继续循环，比v大,就不进入此循环，往下执行
				if(i == hi){
					break;
				}
			}
			
//			右侧扫描遇到小于等于切分元素值的元素时停下
			while(SortUtils.less(v, a[--j])){
				//只有右侧比v大就继续执行,
				if (j == lo ){
					break;
				}
				
			}
			//执行到这的时候，a[i] > v > a[j],就应该交换元素
			
			if (i >= j){
				break;
			}
			
			SortUtils.exch(a, i, j);
			
		}
		
		SortUtils.exch(a, lo, j);//将 v =a[j] 放入正确的位置
		
		return j;
	}
	
}

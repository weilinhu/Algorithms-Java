package sort;



/**
 * 
 * @author weilinhu
 *
 */
public class SortUtils {

	public static void sort(Comparable[] a){
		
	}
	
	/**
	 * 对元素进行比较
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Comparable v,Comparable w){
		
		return v.compareTo(w) < 0;
	}
	
	/**
	 * 交换元素位置
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void exch(Comparable[] a ,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * 打印数组中元素
	 * @param a
	 */
	public static void show (Comparable[] a){
		for(int i = 0;i <a.length;i++){
			System.out.println(a[i]);
		}
	}
	/**
	 * 数组是否有序
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Comparable[] a){
		for(int i = 1;i <a.length;i++){
			if(less(a[i],a[i-1])){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args){
		String[] a  = {"a","b","c","d"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
	/**
	 * 选择排序
	 * @param a
	 */
	
	public static void selectSort(Comparable[] a){
		
		//将a[]按升序排列
		
		int N = a.length;
		for(int i = 0;i < N ; i++){
			int min = i ;
			for (int j = i+1;j<N ;j++){
				if(less(a[i],a[min])){
					exch(a,i,min);
				}	
			}	
		}
			
	}
	
	/**
	 * 插入排序
	 * @param a
	 */
	public static void insertSort(Comparable[] a){
		int N = a.length;
		for(int i=1;i<N;i++){
			//将a[i]插入到前面a[i-1]
			
			for(int j= i;j>0&&less(a[j],a[j-1]);j--){
				exch(a,j,j-1);
			}
		}
	}



}

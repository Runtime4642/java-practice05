package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		System.out.println("\n\nAfter sort.");
		array = bubble_sort(array);
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		// 

	}
	public static int[] bubble_sort(int []list)
	{
		int cnt=1;
		while(cnt!=0)
		{
			cnt=0;
			for(int i=0;i<list.length-1;i++)
			{
				if(list[i]<list[i+1])
				{
					int temp=0;
					temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					cnt++;
				}
			}
			
		}
		return list;
	}
}
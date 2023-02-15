// https://course.acciojob.com/idle?question=a83c0071-ae7b-4bd4-9fdf-7a5b4081f79c




import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        int[] ans = s.bestProducts(arr);
        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }
}

class Solution {
    public static int[] bestProducts(int[][] arr) {
       // Write your code
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[n];
		for(int i =0 ; i< n ;i++)
			{
				int maxIntergerValueineveryrow = -1;
	         	int maxIndexOfmaxIntegerValueIneveryRow = -1;
			   	for(int j = 0; j<m; j++)
				{
			     	 int salesTillPrevDay = i==0?0:arr[i-1][j];
					arr[i][j] = arr[i][j] + salesTillPrevDay;
					if(arr[i][j] > maxIntergerValueineveryrow)
					{
						maxIntergerValueineveryrow = arr[i][j];
						maxIndexOfmaxIntegerValueIneveryRow = j;
					}
				}  
				ans[i] = maxIndexOfmaxIntegerValueIneveryRow;
			}
		return ans;
    }
}

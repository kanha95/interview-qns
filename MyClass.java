package codeup;
import java.util.*;


class pair implements Comparable<pair>{
	int idx, data;
	
	pair(int idx, int data){
		this.idx = idx;
		this.data = data;
	}
	
	public int compareTo(pair that) {
		return Integer.compare(this.data, that.data);
	}
	
}
public class MyClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t>0) {
		int d=sc.nextInt();
		int[][] ar = new int[d][d];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		for (int i = 0; i < ar.length; i++) {
			pq.add(new pair(i,ar[i][0]));
		}
		
		int[] columns = new int[d];
		int count = d;
		while(!pq.isEmpty()) {
			
		pair temp = pq.poll();
		System.out.print(temp.data+" ");
		 if(count!=d*d) {
		  columns[temp.idx] += 1;
		  if(columns[temp.idx] < d) {
		  pq.add(new pair(temp.idx, ar[temp.idx][columns[temp.idx]]));
		  count++;
		  }
		}
		
		}
		
		
		
		t--;
		}
		

	}

}

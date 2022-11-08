package Array;

public class RepeatingElements {

	public static void main(String[] args) {
		// Repeating elements in Array
		int[]a= {9,4,3,2,2,4};
		int tCount=0;
		boolean[] visited=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				tCount++;
			}
		}
		System.out.println(tCount);


	}

}

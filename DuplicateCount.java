package Array;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,4,3,2,3};
		int tcount=0;
		boolean[] visited = new boolean[a.length];
		for(int i=0; i<a.length; i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				tcount++;
			}
		}
		System.out.println(tcount);

	}

}

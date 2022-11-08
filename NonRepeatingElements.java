package Array;

public class NonRepeatingElements {

	public static void main(String[] args) {
		// Non-repeating Elements in an array

		int[] a= {5,4,5,7,9,8,4,9};
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
			if(count==1) {
				System.out.println(a[i]);
			}
		}

	}

}

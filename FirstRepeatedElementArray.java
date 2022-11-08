package Array;

public class FirstRepeatedElementArray {

	public static void main(String[] args) {
		// First Repeated element in an array

		int[] a= {2,5,4,3,6,4};
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
				System.out.println(a[i]);
				break;
			}
		}

	}

}

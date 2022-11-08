package Array;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// Frequency of element in array

		int[] a= {4,3,6,4,9,3,6};
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
			if(count>0) {
				System.out.println(a[i]+" "+count);
			}
		}
	}

}

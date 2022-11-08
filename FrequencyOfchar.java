package Array;

public class FrequencyOfchar {

	public static void main(String[] args) {
		// Frequency of character in string

		String name="Heisenberg";
		char[]a= name.toCharArray();
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

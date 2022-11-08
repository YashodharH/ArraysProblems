package Array;

public class RepeatingCharacterString {

	public static void main(String[] args) {
		// Repeating or duplicate character in a string

		String name="REPEATING_CHARACTER";
		char[] a=name.toCharArray();
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

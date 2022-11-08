package Array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,7,6,4,2,5};
		System.out.println(Arrays.toString(a));
		String res="";
		boolean[] visited=new boolean[a.length];
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
				res=res+a[i];
			}
		}
		char[] c=res.toCharArray();
		System.out.println(Arrays.toString(c));

	}

}

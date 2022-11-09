package Array;

import java.util.Arrays;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=  "Aegon Targarien";
		char[]a=s.toCharArray();
		System.out.println(Arrays.toString(a));
		boolean [] visited= new boolean[a.length];
		String res="";
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

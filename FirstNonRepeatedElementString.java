package Array;

public class FirstNonRepeatedElementString {

	public static void main(String[] args) {
		// First-non Repeated Element in String:

		String name="michael scofield";
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
	    	if(count==1) {
	    		System.out.print(a[i]);
	    	}
	    }
	}

}

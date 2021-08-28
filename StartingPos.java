public class StartingPos{
	
	public static int[] startingPostition(String primary,String pattern){
		int [] arr = {0};
		boolean found = false;
		int nfind = 0;
				
		for (int i = 0; i < primary.length();i++){
			String ss = primary.substring(i);
			int index = ss.indexOf(pattern); //locates substring and gives index number

			if (index == 0){
	
				found = true;
				int[] oldArr = arr;
				arr = new int[nfind + 1];
				for(int j=0; j < oldArr.length; j++){ // copying old array to new array
				
					arr[j] = oldArr[j];
			}
			arr[nfind] = i;
			nfind++;
				
			}			
			if (index == -1){
				if (found == false){
					System.out.println("-1");
				}
				break;			
			}	
		}
		return arr;
	}
			
	public static void main (String[] args){				
		String primary = (args[0]);
		String pattern = (args[1]);
	    int[] indices = startingPostition(primary,pattern);
		for (int i = 0; i< indices.length; i++){
			System.out.println(indices[i]);	
		}
	
	}
	

}

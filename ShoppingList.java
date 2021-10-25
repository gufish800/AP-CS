public class ShoppingList {
	private String itemList;
		
		
	public ShoppingList(){		
		itemList = "";
		
	}
		
	public ShoppingList (String items){
		itemList = items;
		
	}
		
	public String toString() {
			
		return itemList;
	}
		
	public void addItem(String anItem){
		if (itemList.indexOf(anItem) >= 0)
			return;
			
		
		if (itemList.length() > 0){
			itemList = itemList + ", "; 	
		}
		itemList = itemList + anItem;
			
	}
		
	public void removeItem(String removeItem){
		int index = itemList.indexOf(removeItem);
		if (index < 0) {
			return;
		}
		int len = removeItem.length();
		int bigLen = itemList.length();
		String s1 = itemList.substring(0,index);
		String s2 = "";
		if (bigLen < (index + len)){//check if the item is the last item
			s1 = itemList.substring(0,index-1);
			
		}
		else if (bigLen == (index + len)){ //only one item 
			s2 = itemList.substring(index + len);
		}
		else{
			s2 = itemList.substring(index + len+2);
		}
		String result = s1 + s2;
		itemList = result;

	}
	
	public static void main(String args[]){
		ShoppingList gVel = new ShoppingList();
		gVel.addItem("apple");
		gVel.addItem("orange");
		System.out.println(gVel);
		gVel.removeItem("pear");
		gVel.removeItem("orange");
		System.out.println(gVel);
		gVel.removeItem("apple");
		System.out.println(gVel);
	}
		

}

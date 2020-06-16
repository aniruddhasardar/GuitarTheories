package library;

import java.util.LinkedList;

public class CircularList {
	private static final long serialVersionUID = 1L;
	LinkedList<String> linkedList;
	public CircularList(){
		linkedList = new LinkedList<>();
	}
	public String arrangeList(String elementName) {
		String element="";
		do {
			String ele=linkedList.getFirst();
			if(ele.equalsIgnoreCase(elementName)) {
				element= ele;
			} else {
				linkedList.removeFirst();
				linkedList.addLast(ele);
			}
		} while(!element.equalsIgnoreCase(elementName));
		return element;
	}
}

import java.util.ArrayList;

public class Book{
	
	public ArrayList<String> content = new ArrayList<String>();
	public String name;
	
	public Book (String name) {
		this.name=name;
	}
	
	public void createNewParagraph(String paragraph) {
		content.add("Paragraph: " + paragraph);
	}
	
	public void createNewImage(String image) {
		content.add("Paragraph: " + image);
	}
	
	public void createNewTable(String table) {
		content.add("Table: " + table);
	}
	
	public void print() {
		for(int i=0;i<content.size();i++) {
			System.out.println(content.get(i));
		}
	}
}

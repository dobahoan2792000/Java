package MenuDaCap;

public class menu {
	public int id;
	public String name;
	public int parentId;
	public menu() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public menu(int id, String name, int parentId) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}
	
}

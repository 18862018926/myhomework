package testtwo;

public class Book {
	private String id;
	private String name;
	private double price;
	private String type;
	
	public Book(String string, String string2, double d, String string3) {
		// TODO Auto-generated constructor stub
		this.id = string;
		this.name = string2;
		this.price = d;
		this.type = string3;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "书籍信息 [id=" + id + ", name=" + name + ", price=" + price
				+ ", type=" + type + "]";
	}
	
	
}

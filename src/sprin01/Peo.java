package sprin01;

public class Peo {
	
	private String name;
	private int id;
	
	public Peo() {
		super();
		System.out.println("执行构造方法");
	}
	
	public Peo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造");
	}
	public Peo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造Integer");
	}
	public Peo(String name,int id) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造1111111");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "peo [name=" + name + ", id=" + id + "]";
	}
	
	

}

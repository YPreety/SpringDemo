package SetterDemo;

public class EmployeeSetterBean {
	private String name;
	private int id;
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	void display() {
		System.out.println("id : " + id + " name: " + name + " city: " + city);
	}
}

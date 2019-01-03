package prob3;

public abstract class Bird {

	protected String name;
	abstract public void fly();
	abstract public void sing();

	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

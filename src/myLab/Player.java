package myLab;

public abstract class Player {
	private String RoshamboValue;
	private String Name;

	public String getRoshamboValue(String roshamboValue) {
		return RoshamboValue;
	}

	public void setRoshamboValue(String roshamboValue) {
		RoshamboValue = roshamboValue;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public abstract String generateRoshamboValue();

}

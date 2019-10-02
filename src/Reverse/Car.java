package Reverse;

public class Car {
	public static void main(String[] args) {
		Car cc = new Car(12, "alto");

	}

	private Integer carId;
	private String carName;

	private Car() {
	}

	private Car(Integer carId, String carName) {
		this.carId = carId;
		this.carName = carName;
		System.out.println(this.carName);
	}

	public Integer getCarId() {
		return carId;
	}

	public String getCarName() {
		return carName;
	}
}

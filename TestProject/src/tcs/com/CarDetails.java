package tcs.com;



public class CarDetails  {
	protected  void carName() {
		System.out.println("KIA");
	}
	public void carModel() {
		System.out.println("2015");
	}
	public void empId() {
		System.out.println("123654");	
	}
	public void empName() {
		System.out.println("Nagul");	
	}
	public void empAdd() {
		System.out.println("Trichy");	
	}
	public void empPhone() {
		System.out.println("9876543210");			
	}
	public static void main(String[] args) {
		CarDetails s = new CarDetails();
		s.carName();
		s.carModel();
		s.empId();
		s.empName();
		s.empAdd();
		s.empPhone();
		
	}
}
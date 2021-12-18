package abstract_interface_study;


public class TostringOverride {
	private String name = "조유나";
	private String age = "26";
	
	public static void main(String[] args) {
		System.out.println(new TostringOverride().toString());
	}

	@Override
	public String toString() {
		return "Simple_test [name=" + name + ", age=" + age + "]" ;
	}
	
	
	

}

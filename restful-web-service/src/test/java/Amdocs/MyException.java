package Amdocs;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2428489864029438386L;
	public MyException( String s) {
		// TODO Auto-generated constructor stub
		System.out.println(s);
	}
	public static void main(String[] args) {
		try {
			int i=0;
			if(i==0) {
				 
						throw new MyException("New exception occured..!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

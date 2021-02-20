package Amdocs;


	public class Throws extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = -2428489864029438386L;
		public Throws( String s) {
			// TODO Auto-generated constructor stub
			System.out.println(s);
		}
		public static void fun() throws Exception{
			
		}
		public static void main(String[] args) {
			try {
				fun();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

}

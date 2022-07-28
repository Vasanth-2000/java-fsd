package projects;

	public class MethodExecution {

		public double dividenumbers(float a,float b) {
			double z=a/b;
			return z;
		}

		public static void main(String[] args) {

			MethodExecution b=new MethodExecution();
			double ans= b.dividenumbers(32,3);
			System.out.println(ans);
			}


}
	
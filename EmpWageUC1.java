public  class EmpWageUC1 {
		public static void main(String[] args) {
			//constant
			int IS_FULL_TIME=1;
				//computation
			int empCheck= (int) Math.floor(Math.random()*10)%2;
				if (empCheck == IS_FULL_TIME)
				
					System.out.println("Employee is present");
				else
					System.out.println("Employee is absent");
		}
}

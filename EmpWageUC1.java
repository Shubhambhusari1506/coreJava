public  class EmpWageUC1 {
		public static void main(String[] args) {
			//constant
			int WAGE_PER_HOUR=20;			
			int  IS_FULL_TIME=1;
				//Variables 
				int emp_hrs=0;
				int daily_wage=0;

				//computation
			int  empCheck= (int) Math.floor(Math.random()*10)%3;
				if (empCheck==IS_FULL_TIME) {
						
					System.out.println("Employee is present");
						emp_hrs=8;

				}
					else {
						
					System.out.println("Employee is absent");
						emp_hrs=0;
				}
				
						daily_wage=emp_hrs*WAGE_PER_HOUR;
					System.out.println("Employee wage" +daily_wage);
		}
}

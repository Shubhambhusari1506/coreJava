public  class EmpWageUC1 {
		public static void main(String[] args) {
			//constant
			int WAGE_PER_HOUR=20;			
			int  IS_FULL_TIME=1;
			int IS_PART_TIME=2;
			int DAYS_IN_MONTH=20;
				//Variables 
				int emp_hrs=0;
				int monthly_wage=0;
				int days=0;
				//computation
				while (days !=DAYS_IN_MONTH){
			int   empCheck= (int) Math.floor(Math.random()*10)%3;
				if  (empCheck==IS_FULL_TIME)
						{
						 
						 emp_hrs=8;
						}
						else if  (empCheck==IS_PART_TIME) 
							{
							emp_hrs=4;
							} 
						else 
							{
								emp_hrs=0;
							}
					days=days +1;
					monthly_wage=monthly_wage+emp_hrs*WAGE_PER_HOUR;
					}
						System.out.println("Monthly employee wage" +monthly_wage);
		}
	
}

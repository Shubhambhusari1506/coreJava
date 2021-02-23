
public class snakeladderUC1 {
				
				
				
		public  static final int start_pos = 0;
		public static final int ladder = 0;
		public static final int snake = 1;
		public static final int  end_pos = 100;
		


      public static void main (String [] args)


         {
            //variables 
							
				int currentposition = 0;

			
					
				//computation

				while (currentposition != end_pos && currentposition < end_pos)
				{
             	int rollDice;
					rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
					

					
					currentposition += rollDice;


				int checkplay = (int) Math.floor(Math.random() * 10) % 3;
					switch (checkplay)
						{
						case ladder:
						rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
						currentposition += rollDice;
						break;
									

						case snake:
						rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
						if  (currentposition < rollDice) {
			 
						currentposition = start_pos;
						}
						else {
						currentposition -= rollDice;
						}
                  break;

						default:
		    	//no play
						currentposition += 0;
						}

						System.out.println("current position : "  +currentposition);


              
   		}
   }
}



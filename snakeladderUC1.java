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

                  while (currentposition != end_pos)
                  {
                  int rollDice, rollDice1;

                  rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;



                  currentposition += rollDice;

                  if (currentposition > end_pos)
                  {

                  currentposition -= rollDice;

                  }else{

                  int checkplay = (int) Math.floor(Math.random() * 10) % 3;

                  switch (checkplay)
                {

                  case ladder:

                  rollDice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;

                  if (( end_pos - currentposition) < rollDice1){

                  currentposition += 0;

                  }else{

                  currentposition += rollDice1;

                  break;
                  }

                  case snake:

                  rollDice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;

                  if  (currentposition < rollDice) {

                  currentposition = start_pos;
                  }
                  else {

                  currentposition -= rollDice1;
                  }

                  break;

                  default:
               //no play
                  if (currentposition > end_pos){

                  currentposition -= rollDice;

                  }else{

                  currentposition += 0;
                }
      }

}

                  System.out.println("current position : "  +currentposition);

      }

   }

 }


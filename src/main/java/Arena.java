public class Arena
{
    public static Robot fight(Robot botX, Robot botY) {
        while(!botX.isDead() && !botY.isDead()){
            botX.fire(botY);
            if( !botY.isDead() ) botY.fire(botX);
        }
        if(botX.isDead()){
            return botY;
        }else{
            return botX;
        }
    }

    public  static void  main(String[] args) {

        Robot D2R2 = new Robot("D2R2");
        Robot Data = new Robot("Data");
       Data.fire(D2R2);
       System.out.println("The Winner is "+ Arena.fight(D2R2 ,Data));


    }


}

import java.util.Scanner;

public class FactoryPattern{
    public static void main(String[] args){
       try( Scanner sc = new Scanner(System.in)){
        String ship="";
       while((ship = sc.nextLine()) != "Q"){
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip enemyShip = factory.creatEnemyShip(ship);
        enemyShip.followHero();
        enemyShip.displayEnemyShip();
        enemyShip.attackHero();
       }
       }     
    }
}

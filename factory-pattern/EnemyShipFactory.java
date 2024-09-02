public class EnemyShipFactory {

    EnemyShip creatEnemyShip(String name){
        switch (name) {
            case "U": return new UFOEnemyShip();
                
            case "R": return new RocketEnemyShip();

            case "B": return new BigUFOEnemyShip();
        
            default:
                return null;
        }
    }
}

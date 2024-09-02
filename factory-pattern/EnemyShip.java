
class EnemyShip{
    private String name="";
    private  Double damage=0.0;
    private Integer xPos = 0;
    private Integer yPos = 0;
 
    //  EnemyShip(String name, Double damage){
    //      this.name = name;
    //      this.damage = damage;
    //  }  
     
    //  EnemyShip(String name, Double damage, Integer x, Integer y){
    //      this.name = name;
    //      this.damage = damage;
    //      this.xPos = x;
    //      this.yPos = y;
    //  }  
    protected String getName(){
         return name;
     }
     protected void setName(String name){
         this.name = name;
     }
 
    protected Double getDamage(){
         return damage;
     }
 
     protected void setDamage(Double damage){
         this.damage = damage;
     }
 
    protected Integer getXpos(){
         return xPos;
     }
     protected void setXpos(Integer x){
         this.xPos = x;
     }
 
    protected Integer getYpos(){
         return yPos;
     }
 
     protected void setYpos(Integer y){
         this.yPos = y;
     }
 
     public void followHero(){
         System.out.println(getName()+" is following hero ..");
     }
     public void displayEnemyShip(){
         System.out.println(getName() +" is displaying on screen ...");
     }
     public void attackHero()
     {
         System.out.println(getName()+" is attacking and damaging "+getDamage()+" health of hero");
     }
 }

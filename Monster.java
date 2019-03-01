import java.util.HashMap;

public abstract class Monster {

   private Integer hp;
   private Integer xp = 10;
   private Integer agi = 5;
   private Integer def = 5;
   private Integer str = 5;
   private Atttack attack;
   private Integer maxHP = null;
   private HashMap<String, Integer> items;

   public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
      this.maxHP = maxHP;
      hp = this.maxHP;
      this.xp = xp;
      this.items = items;
   }

   @Override
   public String toString() {
      return "hp=" + hp + "/" + maxHP;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(Integer hp) {
      this.hp = hp;
   }

   public Integer getXp() {
      return xp;
   }

   public HashMap<String, Integer> getItems() {
      return items;
   }

   public void setItems(HashMap<String, Integer> items) {
      this.items = items;
   }

   public Integer getMaxHP() {
      return maxHP;
   }

   public boolean equals(Object obj) {
      return true;
   }

   public int hashCode() {
      return 0;
   }
}

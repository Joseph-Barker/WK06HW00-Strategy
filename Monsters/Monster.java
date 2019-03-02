package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {

   private Integer hp;
   private Integer xp = 10;
   Integer agi = 5;
   Integer def = 5;
   Integer str = 5;
   Attack attack;
   private Integer maxHP = null;
   private HashMap<String, Integer> items;

   public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
      this.maxHP = maxHP;
      hp = this.maxHP;
      this.xp = xp;
      this.items = items;
   }

   public Integer attackTarget(Monster monster){
      return attack.attack(monster);
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

   public Integer getAgi() {
      return agi; }

   public Integer getDef() {
      return def; }

   public Integer getStr() {
      return str; }

   // methods returns an integer value between min and max.

   Integer getAttribute(Integer min, Integer max) {
      Random rand = new Random();
      if (min > max) {
         Integer temp = min;
         min = max;
         max = temp;
      }
      //returns a random number between min and max inclusive
      return rand.nextInt(max-min) + min;
   }
   public boolean equals(Object obj) {
      return true;
   }

   public int hashCode() {
      return -1;
   }

   @Override
   public String toString() {
      return "hp=" + hp + "/" + maxHP;
   }
}

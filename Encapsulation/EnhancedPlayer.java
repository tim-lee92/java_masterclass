public class EnhancedPlayer {
  private String name;
  private int health = 100;
  private String weapon;

  public EnhancedPlayer(String name, int health, String weapon) {
    this.name = name;
    validateInitialHealth(health);
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    this.health -= damage;
    if (this.health <= 0) {
      System.out.println(this.name + " has been knocked out.");
    }
  }

  public int getHealth() {
    return this.health;
  }

  private void validateInitialHealth(int health) {
    if (health > 0 && health <= 100) {
      this.health = health;
    }
  }
}

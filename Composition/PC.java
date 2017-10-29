public class PC {
  private Case pcCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
    this.pcCase = pcCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  private void drawLogo() {
    monitor.drawPixelAt(1200, 50, "yellow");
  }

  public void powerUp() {
    this.pcCase.pressPowerButton();
    drawLogo();
  }
}

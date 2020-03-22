package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
  @Test
  public void method01_test() {
    App target = new App();
    assertTrue(target.method01());
  }

  @Test
  public void method02_test() {
    App target = new App();
    assertTrue(target.method02());
  }

  @Test
  public void mtehodSlow01_test() {
    App target = new App();
    assertTrue(target.mtehodSlow01());
  }
}
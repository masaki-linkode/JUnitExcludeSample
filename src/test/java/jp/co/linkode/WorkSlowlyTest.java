package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WorkSlowlyTest {
  @Test
  public void methodSlow_test() {
    WorkSlowly target = new WorkSlowly();
    assertTrue(target.methodSlow());
  }
}
package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UsingDBTest {
  @Test
  public void methodAvailableOnlyIfConditionsAreMet_test() {
    UsingDB target = new UsingDB();
    assertTrue(target.methodAvailableOnlyIfConditionsAreMet());
  }
}
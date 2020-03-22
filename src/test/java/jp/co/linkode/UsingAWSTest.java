package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UsingAWSTest {
  @Test
  public void methodAvailableOnlyIfConditionsAreMet_test() {
    UsingAWS target = new UsingAWS();
    assertTrue(target.methodAvailableOnlyIfConditionsAreMet());
  }
}
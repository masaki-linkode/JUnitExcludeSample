package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import jp.co.linkode.ExcludeTest;

@Category(ExcludeTest.class)
public class UsingAWSTest {
  @Test
  public void methodAvailableOnlyIfConditionsAreMet_test() {
    UsingAWS target = new UsingAWS();
    assertTrue(target.methodAvailableOnlyIfConditionsAreMet());
  }
}
package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import jp.co.linkode.ExcludeTest;

@Category(ExcludeTest.class)
public class UsingDBTest {
  @Test
  public void methodAvailableOnlyIfConditionsAreMet_test() {
    UsingDB target = new UsingDB();
    assertTrue(target.methodAvailableOnlyIfConditionsAreMet());
  }
}
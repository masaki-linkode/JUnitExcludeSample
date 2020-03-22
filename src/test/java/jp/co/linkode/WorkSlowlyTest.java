package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import jp.co.linkode.ExcludeTest;

@Category(ExcludeTest.class)
public class WorkSlowlyTest {
  @Test
  public void methodSlow_test() {
    WorkSlowly target = new WorkSlowly();
    assertTrue(target.methodSlow());
  }
}
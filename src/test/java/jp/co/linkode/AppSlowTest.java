package jp.co.linkode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import jp.co.linkode.ExcludeTest;

@Category(ExcludeTest.class)
public class AppSlowTest {
  @Test
  public void mtehodSlow01_test() {
    App target = new App();
    assertTrue(target.mtehodSlow01());
  }
}
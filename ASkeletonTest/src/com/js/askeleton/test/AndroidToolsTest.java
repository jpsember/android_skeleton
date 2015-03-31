package com.js.askeleton.test;

import com.js.testUtils.*;
import static com.js.android.AndroidTools.*;

public class AndroidToolsTest extends MyTestCase {

  public void testResourceMappings() {
    String s = readTextFileResource(getContext(), R.raw.alpha);
    assertTrue(s.contains("alpha"));
  }
}

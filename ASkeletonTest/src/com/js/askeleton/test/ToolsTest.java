package com.js.askeleton.test;

import com.js.basic.Tools;
import com.js.testUtils.*;
import static com.js.basic.Tools.*;

public class ToolsTest extends MyTestCase {

	public void testSnapshot() {
		Tools.ASSERT(true);
		IOSnapshot.open(false);
		pr("Snapshot test");
		IOSnapshot.close();
	}
}

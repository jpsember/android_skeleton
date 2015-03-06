package com.js.askeleton.test;

import com.js.testUtils.*;
import static com.js.basic.Tools.*;

public class ToolsTest extends MyTestCase {

	public void testSnapshot() {
		IOSnapshot.open();
		pr("Snapshot test");
		IOSnapshot.close();
	}
}

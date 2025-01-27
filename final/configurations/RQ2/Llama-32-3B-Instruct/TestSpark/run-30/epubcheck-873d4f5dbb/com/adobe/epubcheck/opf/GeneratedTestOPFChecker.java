package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOPFChecker {

    @Test
    public void testOPFChecker() {
        OPFChecker30 checker = new OPFChecker30();

        OPFItem item = mock(OPFItem.class);

        boolean result = checker.checkSpineItem(item, mock(OPFHandler.class));

        assertTrue(result);
    }

    public boolean checkSpineItem(OPFItem item, OPFHandler handler) {
        // Your code here...
        return true;
    }
}

}
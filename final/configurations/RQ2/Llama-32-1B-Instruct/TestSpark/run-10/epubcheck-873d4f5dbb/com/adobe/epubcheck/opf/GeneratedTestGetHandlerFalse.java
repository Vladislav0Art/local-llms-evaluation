package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetHandlerFalse {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testGetHandlerFalse() {
        OPFItem item = new OPFItem();
        assertFalse(item.getHandler());
    }

}
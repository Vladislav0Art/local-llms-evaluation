package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetHandlerTrue {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testGetHandlerTrue() {
        OPFItem item = new OPFItem();
        assertTrue(item.getHandler());
    }

}
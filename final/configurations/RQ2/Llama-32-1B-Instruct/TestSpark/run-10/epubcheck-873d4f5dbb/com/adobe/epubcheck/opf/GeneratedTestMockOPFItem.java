package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestMockOPFItem {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testMockOPFItem() {
        MockOPFItem mockItem = createMockOPFItem();
        assertTrue(mockItem.getHandler());
    }

}
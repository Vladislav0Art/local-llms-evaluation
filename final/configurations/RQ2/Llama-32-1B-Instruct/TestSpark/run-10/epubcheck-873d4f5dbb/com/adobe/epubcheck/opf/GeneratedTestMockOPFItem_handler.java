package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMockOPFItem_handler {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testMockOPFItem_handler() {
        MockOPFItem mockItem = createMockOPFItem();
        assertTrue(mockItem.getHandler());
    }

}
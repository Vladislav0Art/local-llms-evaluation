package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest_getHandler_true {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void test_getHandler_true() {
        OPFItem item = createMockOPFItem().getHandler();
        assertTrue(item);
    }

}
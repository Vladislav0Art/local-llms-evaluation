package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest_checkContent_false {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void test_checkContent_false() {
        OPFCreator creator = new OPFCreator();
        assertFalse(creator.checkContent());
        assertFalse(creator.getHandler());
    }

}
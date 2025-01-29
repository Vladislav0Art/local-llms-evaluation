package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCheckContent_false {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testCheckContent_false() {
        OPFCreator creator = new OPFCreator();
        assertFalse(creator.checkContent());
        assertFalse(creator.getHandler());
    }

}
package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetHandler_false {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testGetHandler_false() {
        OPFCreator creator = new OPFCreator();
        assertFalse(creator.checkContent());
        assertFalse(creator.getHandler());
    }

}
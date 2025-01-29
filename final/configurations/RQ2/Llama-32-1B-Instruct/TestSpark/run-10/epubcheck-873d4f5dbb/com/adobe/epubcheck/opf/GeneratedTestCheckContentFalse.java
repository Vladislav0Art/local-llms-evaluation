package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestCheckContentFalse {

    public MockOPFItem createMockOPFItem() {
        return new MockOPFItem();
    }

    @Test
    public void testCheckContentFalse() {
        OPFCreator creator = new OPFCreator();
        assertFalse(creator.checkContent());
    }

}
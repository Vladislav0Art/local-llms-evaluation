package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOPFItem {

    @Test
    public void testOPFItem() {
        OPFItem item = mock(OPFItem.class);

        when(item.getMetadata()).thenReturn(new Metadata());

        boolean result = checkItem(item, mock(OPFHandler.class));

        assertTrue(result);
    }

    public boolean checkItem(OPFItem item, OPFHandler handler) {
        // Your code here...
        return true;
    }
}

}
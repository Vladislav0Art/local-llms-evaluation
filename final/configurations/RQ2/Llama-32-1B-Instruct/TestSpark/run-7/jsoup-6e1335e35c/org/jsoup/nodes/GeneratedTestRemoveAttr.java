package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveAttr {

    @Test
    public void testRemoveAttr() {
        String attrKey = "my-attr";
        String updatedAttrValue = removeAttr(attrKey);
        assertEquals("", updatedAttrValue);
    }

}
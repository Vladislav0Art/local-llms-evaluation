package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetNewClassAttribute {

    @Test
    public void testGetNewClassAttribute() {
        String attrKey = "my-attr";
        String value = newClass();
        String newValueValue = getNewClassAttribute(attrKey, value);
        assertEquals(value, newValueValue);
    }

}
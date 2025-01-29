package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestClearAttributes {

    @Test
    public void testClearAttributes() {
        String attributes = "class='old-class'";
        String updatedClassAttribute = getUpdatedClassAttribute(attributes);
        assertEquals("new-class", updatedClassAttribute);
    }

}
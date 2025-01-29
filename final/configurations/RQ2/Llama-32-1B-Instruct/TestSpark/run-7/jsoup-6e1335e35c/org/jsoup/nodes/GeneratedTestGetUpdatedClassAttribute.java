package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetUpdatedClassAttribute {

    @Test
    public void testGetUpdatedClassAttribute() {
        String attributes = "class='old-class'";
        Node node = new Node();
        String updatedClassAttribute = getUpdatedClassAttribute(attributes, node);
        assertEquals("new-class", updatedClassAttribute);
    }

}
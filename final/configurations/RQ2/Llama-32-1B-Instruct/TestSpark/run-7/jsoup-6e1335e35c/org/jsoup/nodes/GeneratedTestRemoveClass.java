package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRemoveClass {

    @Test
    public void testRemoveClass() {
        String classAttr = "class='old-class'";
        Node node = new Node();
        updatedClassAttr = removeClass(classAttr, node);
        assertEquals("new-class", updatedClassAttr);
    }

}
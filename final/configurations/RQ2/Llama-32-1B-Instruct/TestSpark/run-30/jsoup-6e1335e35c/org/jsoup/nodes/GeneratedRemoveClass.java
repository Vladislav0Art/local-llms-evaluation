package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRemoveClass {

    @Test
    public void removeClass() {
        Node node = new Node("node1", "class1");
        node.removeClass("class1");
        assertEquals(null, node.getClass());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddClass {

    @Test
    public void addClass() {
        Node node = new Node("node1", "class1");
        node.addClass("class2");
        assertEquals("class2", node.getClass());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldHaveClass {

    @Test
    public void shouldHaveClass() {
        Node node = new Node("node1", "class1");
        assertEquals("class1", node.getClass());
    }

}
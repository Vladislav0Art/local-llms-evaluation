package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestToggleClassName {

    @Test
    public void testToggleClassName() {
        Node node = new Node();
        node.setText("");
        node.addClass("Class");
        node.toggleClassName("Class");
        assertThat(node.getClass(), org.junit.Assert.assertEquals("Class", node.getClass()));
    }

}
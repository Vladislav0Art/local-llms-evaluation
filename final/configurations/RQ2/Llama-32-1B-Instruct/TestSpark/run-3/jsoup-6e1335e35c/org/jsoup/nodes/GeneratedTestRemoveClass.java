package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestRemoveClass {

    @Test
    public void testRemoveClass() {
        Node node = new Node();
        node.setText("");
        node.addClass("Class1");
        node.removeClass("Class1");
        assertThat(node.hasClass("Class1"), org.junit.Assert.assertFalse(node.hasClass("Class1")));
    }

}
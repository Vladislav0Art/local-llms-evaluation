package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestHasClass {

    @Test
    public void testHasClass() {
        Node node = new Node();
        node.setText("");
        node.setClassName("Class");
        assertThat(node.hasClass("Class"), org.junit.Assert.assertTrue(node.hasClass("Class")));
    }

}
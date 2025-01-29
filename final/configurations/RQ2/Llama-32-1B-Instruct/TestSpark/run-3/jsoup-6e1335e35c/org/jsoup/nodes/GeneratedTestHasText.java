package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestHasText {

    @Test
    public void testHasText() {
        Node node = new Node();
        node.setText("");
        assertThat(node.hasText(), org.junit.Assert.assertFalse(node.hasText()));
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestText {

    @Test
    public void testText() {
        Node node = new Node();
        node.setText("Hello");
        assertThat(node.text(), org.junit.Assert.assertEquals("Hello", node.text()));
    }

}
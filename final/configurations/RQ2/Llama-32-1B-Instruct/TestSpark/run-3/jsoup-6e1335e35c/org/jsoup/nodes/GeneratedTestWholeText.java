package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestWholeText {

    @Test
    public void testWholeText() {
        Node node = new Node();
        node.setWholeText("World!");
        assertThat(node.wholeText(), org.junit.Assert.assertEquals("World!", node.wholeText()));
    }

}
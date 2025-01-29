package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestOwnText {

    @Test
    public void testOwnText() {
        Node node = new Node();
        node.setOwnText("Foo");
        assertThat(node.ownText(), org.junit.Assert.assertEquals("Foo", node.ownText()));
    }

}
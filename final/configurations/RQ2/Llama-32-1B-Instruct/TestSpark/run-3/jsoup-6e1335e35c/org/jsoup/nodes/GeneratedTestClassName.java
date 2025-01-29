package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestClassName {

    @Test
    public void testClassName() {
        Node node = new Node();
        node.setClassName("Class");
        assertThat(node.className(), org.junit.Assert.assertEquals("Class", node.className()));
    }

}
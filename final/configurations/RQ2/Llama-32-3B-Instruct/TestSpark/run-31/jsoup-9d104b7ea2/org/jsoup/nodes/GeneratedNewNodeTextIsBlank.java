package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedNewNodeTextIsBlank {

    @Test
    public void newNodeTextIsBlank() {
        TextNode node = new TextNode("   ");
        assertThat(node.isBlank(), is(true));
    }

}
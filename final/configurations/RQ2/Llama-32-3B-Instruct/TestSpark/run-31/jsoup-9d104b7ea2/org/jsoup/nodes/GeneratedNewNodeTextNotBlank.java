package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedNewNodeTextNotBlank {

    @Test
    public void newNodeTextNotBlank() {
        TextNode node = new TextNode("not blank");
        assertThat(node.isBlank(), is(false));
    }

}
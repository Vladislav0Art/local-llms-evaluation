package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedNewNodeTextIsEmpty {

    @Test
    public void newNodeTextIsEmpty() {
        TextNode node = new TextNode("");
        assertThat(node.text(), is(""));
    }

}
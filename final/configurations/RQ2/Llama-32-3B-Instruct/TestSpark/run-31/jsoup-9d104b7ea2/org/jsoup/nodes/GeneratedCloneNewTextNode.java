package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedCloneNewTextNode {

    @Test
    public void cloneNewTextNode() {
        String text = "text";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.clone();
        assertThat(node2.text(), is(text));
    }

}
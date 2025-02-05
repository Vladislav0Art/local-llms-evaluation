package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("TestNode");
        TextNode clonedNode = textNode.clone();
        assertThat(clonedNode).isEqualTo(textNode);
        assertThat(clonedNode).isNotSameAs(textNode);
    }

}
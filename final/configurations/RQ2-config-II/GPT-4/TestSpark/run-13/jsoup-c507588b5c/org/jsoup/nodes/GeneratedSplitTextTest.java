package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("TestNode");
        TextNode splittedNode = textNode.splitText(4);
        assertThat(textNode.getWholeText()).isEqualTo("Test");
        assertThat(splittedNode.getWholeText()).isEqualTo("Node");
    }

}
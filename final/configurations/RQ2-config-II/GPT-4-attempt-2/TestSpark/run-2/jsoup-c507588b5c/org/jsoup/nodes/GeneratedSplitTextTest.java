package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("TestNode");
        TextNode splitted = node.splitText(4);
        Assert.assertThat(node.getWholeText(), is("Test"));
        Assert.assertThat(splitted.getWholeText(), is("Node"));
    }

}
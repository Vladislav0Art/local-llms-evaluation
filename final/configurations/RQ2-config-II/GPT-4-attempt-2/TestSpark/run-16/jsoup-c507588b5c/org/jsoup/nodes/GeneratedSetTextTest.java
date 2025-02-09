package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Test text");
        textNode.text("Modified text");
        Assert.assertEquals("Modified text", textNode.getWholeText());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedGetWholeText_ValidText_ShouldReturnText {

    @Test
    public void getWholeText_ValidText_ShouldReturnText() {
        TextNode textNode = new TextNode("WholeTextTest");
        Assert.assertEquals("WholeTextTest", textNode.getWholeText());
    }

}
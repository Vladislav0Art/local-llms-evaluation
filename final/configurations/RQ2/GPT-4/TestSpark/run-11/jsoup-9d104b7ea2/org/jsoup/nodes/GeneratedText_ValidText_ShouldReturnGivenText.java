package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedText_ValidText_ShouldReturnGivenText {

    @Test
    public void text_ValidText_ShouldReturnGivenText() {
        TextNode textNode = new TextNode("GivenText");
        Assert.assertEquals("GivenText", textNode.text());
    }

}
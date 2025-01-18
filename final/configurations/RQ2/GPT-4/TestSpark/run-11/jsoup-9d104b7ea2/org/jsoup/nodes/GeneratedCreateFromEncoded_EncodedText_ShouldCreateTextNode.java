package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedCreateFromEncoded_EncodedText_ShouldCreateTextNode {

    @Test
    public void createFromEncoded_EncodedText_ShouldCreateTextNode() {
        TextNode textNode = TextNode.createFromEncoded("EncodedText");
        Assert.assertNotNull(textNode);
        Assert.assertEquals("EncodedText", textNode.text());
    }

}
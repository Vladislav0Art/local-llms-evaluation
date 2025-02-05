package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "test text";
        TextNode textNode = new TextNode(text);
        Assert.assertEquals(text, textNode.text());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Test text");
        Assert.assertNotNull(textNode);
    }

}
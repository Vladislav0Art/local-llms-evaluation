package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextTest {

    @Test
    public void TextTest() {
        String text = "new text";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

}
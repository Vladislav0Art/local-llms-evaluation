package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        String newText = "new text";
        textNode.text(newText);
        Assert.assertEquals(newText, textNode.text());
    }

}
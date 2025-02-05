package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        String text = "Some text";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        Assert.assertEquals(text, textNode.text());
    }

}
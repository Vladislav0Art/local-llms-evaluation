package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Parser;

public class GeneratedText_SetTextTest {

    @Test
    public void text_SetTextTest() {
        String newText = "new text";
        TextNode node = new TextNode("");
        node.text(newText);
        Assert.assertEquals(newText, node.text());
    }

}
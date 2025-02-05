package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTextNewTextTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void textNewTextTest() {
        TextNode textNode = new TextNode("old text");
        String newText = "new text";
        textNode.text(newText);
        Assert.assertEquals(newText, textNode.text());
    }

}
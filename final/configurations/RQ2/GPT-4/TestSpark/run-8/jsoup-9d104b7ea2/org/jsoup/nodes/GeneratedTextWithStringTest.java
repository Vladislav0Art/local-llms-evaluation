package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextWithStringTest {

    @Test
    public void textWithStringTest() {
        String newText = "New text";
        TextNode textNode = new TextNode("Test text");

        textNode.text(newText);

        Assert.assertEquals(newText, textNode.text());
    }

}
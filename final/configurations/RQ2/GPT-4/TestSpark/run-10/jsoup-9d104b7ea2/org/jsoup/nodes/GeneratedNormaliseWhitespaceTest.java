package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = "   \n   Hello, \t\t\t World   \n   ";
        String normalizedText = TextNode.normaliseWhitespace(textWithWhitespace);

        Assert.assertEquals("Hello, World", normalizedText);
    }

}
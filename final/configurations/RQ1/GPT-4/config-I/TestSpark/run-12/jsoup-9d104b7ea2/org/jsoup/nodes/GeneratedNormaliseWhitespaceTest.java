package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithExtraSpaces = "   Hello     World    ";
        String expectedText = "Hello World";
        Assert.assertEquals(expectedText, TextNode.normaliseWhitespace(textWithExtraSpaces));
    }

}
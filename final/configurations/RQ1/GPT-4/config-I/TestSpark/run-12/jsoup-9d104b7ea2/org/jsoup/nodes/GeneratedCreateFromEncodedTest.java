package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Hello World&lt;/p&gt;";
        String expectedText = Parser.unescapeEntities(encodedText, false);
        Assert.assertEquals(expectedText, TextNode.createFromEncoded(encodedText).getWholeText());
    }

}
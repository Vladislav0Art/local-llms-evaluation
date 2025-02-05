package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedStripLeadingWhitespaceTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "    example text";
        String strippedText = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals(strippedText, "example text");
    }

}
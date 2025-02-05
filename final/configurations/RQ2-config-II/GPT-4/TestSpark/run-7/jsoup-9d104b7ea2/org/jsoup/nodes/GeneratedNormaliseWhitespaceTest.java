package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormaliseWhitespaceTest {

    private static final Document.OutputSettings outputSettings = new Document.OutputSettings();

    @Test
    public void normaliseWhitespaceTest() {
        String notNormalizedText = "example    text";
        String normalizedText = TextNode.normaliseWhitespace(notNormalizedText);
        Assert.assertEquals(normalizedText, "example text");
    }

}
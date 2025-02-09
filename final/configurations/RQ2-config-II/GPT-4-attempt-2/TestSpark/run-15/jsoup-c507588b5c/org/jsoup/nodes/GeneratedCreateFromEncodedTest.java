package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "<test>Test Node</test>";
        TextNode textNode = TextNode.createFromEncoded(encodedText, true);
        Assert.assertEquals("<test>Test Node</test>", textNode.getWholeText());
    }

}
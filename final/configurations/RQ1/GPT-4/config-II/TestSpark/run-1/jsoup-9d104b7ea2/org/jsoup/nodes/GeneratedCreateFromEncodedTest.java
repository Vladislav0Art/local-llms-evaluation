package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;a&gt;hello&lt;/a&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("<a>hello</a>", node.getWholeText());
    }

}
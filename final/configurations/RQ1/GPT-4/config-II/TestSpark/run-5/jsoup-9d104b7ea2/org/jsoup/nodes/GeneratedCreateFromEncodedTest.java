package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String testEncoded = "&lt;test&gt;";
        TextNode node = new TextNode("test");
        Assert.assertEquals(node.getWholeText(), TextNode.createFromEncoded(testEncoded).getWholeText());
    }

}
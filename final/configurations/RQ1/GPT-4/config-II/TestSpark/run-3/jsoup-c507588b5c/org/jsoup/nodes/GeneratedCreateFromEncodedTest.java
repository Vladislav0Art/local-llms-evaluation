package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Hello&amp;World");
        Assert.assertEquals("Hello&World", textNode.getWholeText());
    }

}
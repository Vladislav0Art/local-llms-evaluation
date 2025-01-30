package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "&amp; &gt; &lt;";
        TextNode tn = TextNode.createFromEncoded(encoded);
        Assert.assertEquals("& > <", tn.getWholeText());
    }

}
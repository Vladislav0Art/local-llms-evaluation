package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("test");
        Assert.assertEquals("test", tn.getWholeText());
    }

}
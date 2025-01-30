package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String value = "    WholeText    Test   ";
        TextNode tn = new TextNode(value);
        Assert.assertEquals(value, tn.getWholeText());
    }

}
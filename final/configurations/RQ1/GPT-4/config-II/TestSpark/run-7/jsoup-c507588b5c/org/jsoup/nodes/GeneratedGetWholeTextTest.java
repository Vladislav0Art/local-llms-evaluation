package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode(" Test ");
        Assert.assertEquals(" Test ", node.getWholeText());
    }

}
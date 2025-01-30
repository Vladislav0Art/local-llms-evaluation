package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        TextNode textNode = new TextNode("<div>Hello, World!</div>");
        Assert.assertEquals("<div>Hello, World!</div>", textNode.toString());
    }

}
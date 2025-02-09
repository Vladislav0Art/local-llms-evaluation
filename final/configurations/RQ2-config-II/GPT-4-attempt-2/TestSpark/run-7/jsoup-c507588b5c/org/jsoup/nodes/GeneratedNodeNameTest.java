package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode tn = new TextNode("");
        Assert.assertEquals("#text", tn.nodeName());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeNameTest {

    @Test
    public void NodeNameTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}
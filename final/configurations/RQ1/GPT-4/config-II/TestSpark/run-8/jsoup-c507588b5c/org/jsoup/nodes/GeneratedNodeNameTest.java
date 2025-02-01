package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("");
        Assert.assertEquals("#text", textNode.nodeName());
    }

}
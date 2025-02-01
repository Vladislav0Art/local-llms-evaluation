package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        final String text = "sample text";
        TextNode textNode = new TextNode(text);
        TextNode cloneTextNode = textNode.clone();
        Assert.assertEquals(cloneTextNode.text(), textNode.text());
    }

}
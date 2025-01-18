package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn1 = new TextNode("Test");
        TextNode tn2 = tn1.clone();
        Assert.assertNotSame(tn1, tn2);
        Assert.assertEquals(tn1.text(), tn2.text());
    }

}
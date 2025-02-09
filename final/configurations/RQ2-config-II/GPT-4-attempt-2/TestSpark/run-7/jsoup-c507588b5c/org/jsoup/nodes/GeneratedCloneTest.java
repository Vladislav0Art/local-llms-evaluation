package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("Test");
        TextNode clone = tn.clone();
        Assert.assertEquals(tn.text(), clone.text());
    }

}
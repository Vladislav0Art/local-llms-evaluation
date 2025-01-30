package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode cloned = tn.clone();
        Assert.assertNotSame(tn, cloned);
        Assert.assertEquals(tn.text(), cloned.text());
    }

}
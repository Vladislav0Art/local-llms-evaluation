package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    // Test for constructor

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnclone = tn.clone();
        Assert.assertNotSame(tn, tnclone);
        Assert.assertEquals(tn.text(), tnclone.text());
    }

}
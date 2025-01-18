package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextNewTextSetTest {

    // Test for constructor

    @Test
    public void textNewTextSetTest() {
        final TextNode tn = new TextNode("old text");
        tn.text("new text");
        Assert.assertEquals("new text", tn.getWholeText());
    }

}
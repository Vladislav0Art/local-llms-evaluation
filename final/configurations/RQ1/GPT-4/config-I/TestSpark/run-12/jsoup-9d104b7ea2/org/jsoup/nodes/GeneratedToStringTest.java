package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertEquals("test text", tn.toString());
    }

}
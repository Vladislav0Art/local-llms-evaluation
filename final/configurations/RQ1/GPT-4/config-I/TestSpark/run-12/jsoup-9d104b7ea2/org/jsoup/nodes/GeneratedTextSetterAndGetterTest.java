package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTextSetterAndGetterTest {

    @Test
    public void textSetterAndGetterTest() {
        TextNode tn = new TextNode("test text");
        tn.text("new test text");
        Assert.assertEquals("new test text", tn.text());
    }

}
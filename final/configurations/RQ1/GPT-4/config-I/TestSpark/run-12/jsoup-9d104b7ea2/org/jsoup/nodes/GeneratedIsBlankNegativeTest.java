package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankNegativeTest {

    @Test
    public void isBlankNegativeTest() {
        TextNode tn = new TextNode("test text");
        Assert.assertFalse(tn.isBlank());
    }

}
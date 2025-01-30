package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankPositiveTest {

    @Test
    public void isBlankPositiveTest() {
        TextNode tn = new TextNode("    ");
        Assert.assertTrue(tn.isBlank());
    }

}
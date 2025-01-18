package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankTrueTest {

    // Test for constructor

    @Test
    public void isBlankTrueTest() {
        TextNode tn = new TextNode(" ");
        Assert.assertTrue(tn.isBlank());
    }

}
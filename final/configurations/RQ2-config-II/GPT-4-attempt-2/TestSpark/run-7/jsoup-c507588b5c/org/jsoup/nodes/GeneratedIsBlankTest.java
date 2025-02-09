package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode tn = new TextNode("");
        Assert.assertTrue(tn.isBlank());
    }

}
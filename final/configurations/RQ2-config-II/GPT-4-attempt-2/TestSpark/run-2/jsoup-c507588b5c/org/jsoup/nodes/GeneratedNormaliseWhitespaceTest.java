package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String input = "  Test   String ";
        String expected = "Test String";
        Assert.assertEquals(expected, TextNode.normaliseWhitespace(input));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String input = "    Strip this";
        String expected = "Strip this";
        Assert.assertEquals(expected, TextNode.stripLeadingWhitespace(input));
    }

}
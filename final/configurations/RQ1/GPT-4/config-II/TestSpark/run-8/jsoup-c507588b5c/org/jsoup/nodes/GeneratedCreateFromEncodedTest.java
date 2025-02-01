package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.helper.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        final String input = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(input);

        final String expected = "<";
        Assert.assertEquals(expected, textNode.text());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = " Some     text in   here ";
        Assert.assertEquals("Some text in here", TextNode.normaliseWhitespace(textWithWhitespace));
    }

}
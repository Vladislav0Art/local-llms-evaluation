package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeCreateFromEncodedTest {

    @Test
    public void textNodeCreateFromEncodedTest() {
        String encodedText = "&amp;hello&nbsp;world!";
        TextNode tn = TextNode.createFromEncoded(encodedText);
        assertEquals("&hello world!", tn.getWholeText());
    }

}
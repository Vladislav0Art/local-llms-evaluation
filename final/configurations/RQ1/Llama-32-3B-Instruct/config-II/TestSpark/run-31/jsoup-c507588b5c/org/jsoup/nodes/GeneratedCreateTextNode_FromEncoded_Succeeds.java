package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextNode_FromEncoded_Succeeds {

    @Test
    public void createTextNode_FromEncoded_Succeeds() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("text", textNode.nodeName());
        assertEquals(originalText, textNode.text());
    }

}
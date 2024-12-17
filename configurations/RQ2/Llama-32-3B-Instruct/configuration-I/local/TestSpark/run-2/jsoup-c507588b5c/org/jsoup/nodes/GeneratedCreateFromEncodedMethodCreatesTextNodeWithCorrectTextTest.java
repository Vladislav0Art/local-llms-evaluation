package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedMethodCreatesTextNodeWithCorrectTextTest {

    @Test
    public void createFromEncodedMethodCreatesTextNodeWithCorrectTextTest() {
        String encodedText = "&lt;Hello&gt; &amp;World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("<Hello> & World", node.text());
    }

}
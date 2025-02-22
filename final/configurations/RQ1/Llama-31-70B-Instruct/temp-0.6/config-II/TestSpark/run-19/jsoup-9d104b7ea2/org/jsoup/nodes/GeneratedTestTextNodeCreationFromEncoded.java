package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeCreationFromEncoded {

    @Test
    public void testTextNodeCreationFromEncoded() {
        String encodedText = "&lt;p&gt;This is a test&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>This is a test</p>", textNode.text());
    }

}
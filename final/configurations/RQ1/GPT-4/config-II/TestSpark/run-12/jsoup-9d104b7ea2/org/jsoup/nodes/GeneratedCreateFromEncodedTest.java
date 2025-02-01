package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;p&gt;Hello, World!&lt;/p&gt;");
        assertNotNull(textNode);
        assertEquals("<p>Hello, World!</p>", textNode.getWholeText());
    }

}
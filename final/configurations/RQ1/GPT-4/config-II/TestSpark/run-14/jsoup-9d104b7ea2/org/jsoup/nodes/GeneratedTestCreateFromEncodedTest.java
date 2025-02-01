package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCreateFromEncodedTest {

    @Test
    public void testCreateFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;div&gt;Hello, world!&lt;/div&gt;");
        assertEquals("<div>Hello, world!</div>", textNode.getWholeText());
    }

}
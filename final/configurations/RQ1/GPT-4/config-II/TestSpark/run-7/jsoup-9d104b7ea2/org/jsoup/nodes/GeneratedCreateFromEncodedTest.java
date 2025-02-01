package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;Test&gt;");
        assertNotNull(node);
        assertEquals("<Test>", node.getWholeText());
    }

}
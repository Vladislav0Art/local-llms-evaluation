package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&amp;lt;test&amp;gt;");
        assertEquals("<test>", node.getWholeText());
    }

}
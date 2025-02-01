package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String value = "&amp;Test value";
        TextNode node = TextNode.createFromEncoded(value);

        assertEquals("&Test value", node.getWholeText());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTypicalTest {

    @Test
    public void normaliseWhitespaceTypicalTest() {
        String output = TextNode.normaliseWhitespace(" Hello   World ");

        assertEquals("Hello World", output);
    }

}
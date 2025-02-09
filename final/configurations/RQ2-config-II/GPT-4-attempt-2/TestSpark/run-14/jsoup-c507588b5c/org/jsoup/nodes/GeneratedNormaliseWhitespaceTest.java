package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String result = TextNode.normaliseWhitespace(" Hello    World ");
        assertEquals(" Hello World ", result);
    }

}
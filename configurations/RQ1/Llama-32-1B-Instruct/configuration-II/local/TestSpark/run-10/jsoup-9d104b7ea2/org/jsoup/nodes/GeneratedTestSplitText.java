package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() throws IOException {
        TextNode text = new TextNode("<a href='#'>Hello</a>");
        TextNode result = text.splitText(0);
        assertNotNull(result);

        assertTrue(result.text().isEmpty());

        TextNode tempText = new TextNode("   Hello World!   ");
        TextNode result2 = text.splitText(0);
        assertEquals(tempText, result2);
    }

}
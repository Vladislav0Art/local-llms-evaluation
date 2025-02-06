package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSplitText TextNodeSplitTextTest {

    @Test
    public void splitText

    TextNodeSplitTextTest() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode result1 = textNode.splitText(6);
        assertNotNull(result1);

        String expectedSecondPart = "World";
        assertEquals(expectedSecondPart, result1.text());

        assertEquals("Hello", textNode.splitText(0).text());
    }

}
package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 5;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertEquals(8, result.text().length());
    }

}
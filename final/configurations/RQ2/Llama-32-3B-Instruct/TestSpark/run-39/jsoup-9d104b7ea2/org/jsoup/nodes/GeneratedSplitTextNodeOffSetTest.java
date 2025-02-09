package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitTextNodeOffSetTest {

    @Test
    public void splitTextNodeOffSetTest() {
        String text = "Hello World";
        List<String> result1 = TextNode.splitText(text, 6);
        assertNotNull(result1.get(0));
        assertEquals("World", result1.get(0));

        List<String> result2 = TextNode.splitText(text, text.length());
        assertNull(result2.get(0));
    }

}
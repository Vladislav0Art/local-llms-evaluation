package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}
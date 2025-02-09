package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb.append(' ').append('\n')));
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}
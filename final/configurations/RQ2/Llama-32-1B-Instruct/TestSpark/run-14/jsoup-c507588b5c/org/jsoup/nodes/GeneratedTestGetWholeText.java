package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello World";
        String actual = node.getWholeText();
        assertNotEquals(expected, actual);

        verify(StringUtil).splitText(0); // This should not be called

        String truncated = node.getWholeText(10);
        assertEquals(expected.substring(0, 10), truncated);
    }

}
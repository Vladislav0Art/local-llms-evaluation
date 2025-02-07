package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestSplitTextReturnsTextSlice {

    @Test
    public void testSplitTextReturnsTextSlice() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        String[] slice = node splitText(4);
        assertEquals("Hello", slice[0]);
        assertEquals("World", slice[1]);
        assertArrayEquals(null, slice[2]);
    }

}
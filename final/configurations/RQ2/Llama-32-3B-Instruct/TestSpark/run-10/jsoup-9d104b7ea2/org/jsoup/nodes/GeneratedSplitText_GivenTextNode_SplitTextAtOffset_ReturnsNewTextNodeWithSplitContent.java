package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSplitText_GivenTextNode_SplitTextAtOffset_ReturnsNewTextNodeWithSplitContent {

    @Test
    public void splitText_GivenTextNode_SplitTextAtOffset_ReturnsNewTextNodeWithSplitContent() throws IOException {
        String text = "Hello World";
        int offset = 5;
        TextNode expected = new TextNode("World");
        TextNode actual = new TextNode(text);
        actual.splitText(offset);
        assertEquals(expected, (TextNode) actual);
    }

}
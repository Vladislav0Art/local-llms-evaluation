package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedSplitText_GivenOffsetAndReturnsCorrectSplitText {

    @Test
    public void splitText_GivenOffsetAndReturnsCorrectSplitText() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        String result = textNode.splitText(offset);
        assertEquals("World!", result);
    }

}
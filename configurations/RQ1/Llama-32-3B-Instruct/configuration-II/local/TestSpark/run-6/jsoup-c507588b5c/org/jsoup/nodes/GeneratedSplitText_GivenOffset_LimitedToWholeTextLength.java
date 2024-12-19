package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_GivenOffset_LimitedToWholeTextLength {

    @Test
    public void splitText_GivenOffset_LimitedToWholeTextLength() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(6, tailNode.getWholeText().length());
    }

}
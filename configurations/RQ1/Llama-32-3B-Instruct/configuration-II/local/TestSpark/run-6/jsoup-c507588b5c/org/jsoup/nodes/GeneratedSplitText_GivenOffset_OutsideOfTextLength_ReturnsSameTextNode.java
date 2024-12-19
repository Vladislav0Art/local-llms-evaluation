package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_GivenOffset_OutsideOfTextLength_ReturnsSameTextNode {

    @Test
    public void splitText_GivenOffset_OutsideOfTextLength_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        int offset = 10;
        TextNode result = textNode.splitText(offset);
        assertEquals(textNode, result);
    }

}
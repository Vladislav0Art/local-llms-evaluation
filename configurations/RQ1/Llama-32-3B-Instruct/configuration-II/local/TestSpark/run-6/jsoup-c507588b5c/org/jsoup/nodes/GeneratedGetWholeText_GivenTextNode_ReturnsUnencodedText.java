package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedGetWholeText_GivenTextNode_ReturnsUnencodedText {

    @Test
    public void getWholeText_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello\nWorld");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello\nWorld", wholeText);
    }

}
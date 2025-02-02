package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTextGetWholeTextTrimmingWhitespaceTest {

    @Test
    public void textGetWholeTextTrimmingWhitespaceTest() {
        String normalisedText = StringUtil.normaliseWhitespace("   Hello World   ");
        TextNode node = new TextNode(normalisedText);
        String result = node.getWholeText();
        assertEquals(normalisedText, result);
    }

}
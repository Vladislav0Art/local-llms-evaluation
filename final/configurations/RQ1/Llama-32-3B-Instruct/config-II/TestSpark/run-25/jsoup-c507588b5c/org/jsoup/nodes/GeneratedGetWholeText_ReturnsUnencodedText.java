package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGetWholeText_ReturnsUnencodedText {

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello World");
        String wholeText = textNode.getWholeText();
        assertTrue(wholeText.contains("Hello "));
        assertTrue(wholeText.contains("World"));
    }

}
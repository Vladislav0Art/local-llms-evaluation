package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedGetWholeText {

    @Test
    public void getWholeText() {
        TextNode textNode = new TextNode("Hello World");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello World", wholeText);
    }

}
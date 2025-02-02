package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedGetWholeText {

    @Test
    public void getWholeText() {
        TextNode textNode = new TextNode("This is a test");
        String wholeText = textNode.getWholeText();
        assertEquals(textNode.text(), wholeText);
    }

}
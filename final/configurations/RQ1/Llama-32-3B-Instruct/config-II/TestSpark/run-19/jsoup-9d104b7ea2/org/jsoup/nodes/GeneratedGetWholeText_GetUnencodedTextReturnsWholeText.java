package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGetWholeText_GetUnencodedTextReturnsWholeText {

    @Test
    public void getWholeText_GetUnencodedTextReturnsWholeText() {
        String text = "Hello\nWorld!";
        TextNode node = new TextNode(text);
        assertEquals("Hello\nWorld!", node.getWholeText());
    }

}
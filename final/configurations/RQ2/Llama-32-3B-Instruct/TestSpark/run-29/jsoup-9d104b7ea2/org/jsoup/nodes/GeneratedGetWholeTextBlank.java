package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedGetWholeTextBlank {

    @Test
    public void getWholeTextBlank() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.getWholeText());
    }

}
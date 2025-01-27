package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedGetWholeTextNonBlank {

    @Test
    public void getWholeTextNonBlank() {
        String text = "Test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}
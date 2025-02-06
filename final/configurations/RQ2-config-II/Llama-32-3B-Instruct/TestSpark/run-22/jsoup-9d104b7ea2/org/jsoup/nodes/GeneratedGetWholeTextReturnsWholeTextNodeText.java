package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeTextReturnsWholeTextNodeText {

    @Test
    public void getWholeTextReturnsWholeTextNodeText() {
        String expectedText = "text";
        TextNode textNode = new TextNode(expectedText);
        assertEquals(expectedText, textNode.getWholeText());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTextSetsTextNodeContent {

    @Test
    public void textSetsTextNodeContent() {
        String expectedText = "newText";
        TextNode textNode = new TextNode(expectedText);
        textNode.text("newText");
        assertEquals("newText", textNode.text());
    }

}
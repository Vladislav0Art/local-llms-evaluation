package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedIsBlankMETHOD_ReturnsTrueIfTextNodeIsBlank {

    @Test
    public void isBlankMETHOD_ReturnsTrueIfTextNodeIsBlank() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}
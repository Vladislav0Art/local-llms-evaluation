package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneMETHOD_ReturnsCorrectClone {

    @Test
    public void cloneMETHOD_ReturnsCorrectClone() {
        String text = "Hello World";
        TextNode originalText = new TextNode(text);
        TextNode clonedText = originalText.clone();
        assertEquals(originalText.text(), clonedText.text());
    }

}
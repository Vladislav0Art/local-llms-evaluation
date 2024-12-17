package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_SplittingTextNodeAtOffset_ReturnsCorrectNodes {

    @Test
    public void splitText_SplittingTextNodeAtOffset_ReturnsCorrectNodes() throws IOException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode splitTextNode = originalTextNode.splitText(6);
        assertEquals(originalTextNode.text(), originalTextNode.getWholeText());

        String expectedWholeTextAfterSplit = "World";
        assertTrue(splitTextNode.text().equals(expectedWholeTextAfterSplit));
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_returnsUnencodedText {

    @Test
    public void getWholeText_returnsUnencodedText() {
        String encodedText = "&lt;&gt;";
        TextNode textNode = new TextNode(encodedText);
        String expectedText = "><";
        assertEquals(expectedText, textNode.getWholeText());
    }

}
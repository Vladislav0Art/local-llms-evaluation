package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedGetWholeText_EmptyString_ReturnsEmptyString {

    @Test
    public void getWholeText_EmptyString_ReturnsEmptyString() {
        String text = "";
        TextNode node = new TextNode(text);
        assertEquals("", node.getWholeText());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedSplitTextInvalidOffsetTest {

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode node = new TextNode("   ");
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(10));
    }

}
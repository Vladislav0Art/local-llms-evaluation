package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNormaliseWhitespace_replacesWithSpaces {

    @Test
    public void normaliseWhitespace_replacesWithSpaces() {
        assertTrue(TextNode.normaliseWhitespace("Hello\r\nWorld!"));
        assertTrue(TextNode.normaliseWhitespace("\n  Hello\nWorld!\r"));
    }

}
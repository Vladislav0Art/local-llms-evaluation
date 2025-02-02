package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedTextMethodReturnsBlankWhenWhitespaceOnly {

    @Test
    public void textMethodReturnsBlankWhenWhitespaceOnly() {
        String text = "   ";
        LeafNode node = new LeafNode();
        node.createElement().append(text).close();
        assertEquals("", node.text());
    }

}
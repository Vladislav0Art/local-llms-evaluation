package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedTextMethodReturnsCorrectString {

    @Test
    public void textMethodReturnsCorrectString() {
        LeafNode node = new LeafNode();
        String text = "test";
        node.createElement().append(text).close();
        assertEquals(text, node.text());
    }

}
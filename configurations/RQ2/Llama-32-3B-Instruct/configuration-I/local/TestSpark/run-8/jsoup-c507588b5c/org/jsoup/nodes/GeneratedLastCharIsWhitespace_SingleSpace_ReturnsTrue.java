package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespace_SingleSpace_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_SingleSpace_ReturnsTrue() {
        StringBuilder sb = new StringBuilder(" ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}
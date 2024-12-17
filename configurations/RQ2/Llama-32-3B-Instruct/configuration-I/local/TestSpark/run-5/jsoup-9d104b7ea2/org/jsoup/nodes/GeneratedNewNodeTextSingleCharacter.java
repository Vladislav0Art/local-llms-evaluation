package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNewNodeTextSingleCharacter {

    @Test
    public void newNodeTextSingleCharacter() {
        String result = new TextNode("a").text();
        assertEquals("a", result);
    }

}
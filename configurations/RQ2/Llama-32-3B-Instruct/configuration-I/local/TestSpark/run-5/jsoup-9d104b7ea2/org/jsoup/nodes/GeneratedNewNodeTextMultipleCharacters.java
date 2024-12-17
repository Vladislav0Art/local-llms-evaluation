package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNewNodeTextMultipleCharacters {

    @Test
    public void newNodeTextMultipleCharacters() {
        String result = new TextNode("abc").text();
        assertEquals("abc", result);
    }

}
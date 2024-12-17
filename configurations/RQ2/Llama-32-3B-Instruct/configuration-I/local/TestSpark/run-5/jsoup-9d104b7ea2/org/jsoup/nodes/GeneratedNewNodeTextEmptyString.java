package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNewNodeTextEmptyString {

    @Test
    public void newNodeTextEmptyString() {
        String result = new TextNode("").text();
        assertEquals("", result);
    }

}
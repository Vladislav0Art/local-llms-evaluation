package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedNewNodeTextIsEmpty {

    @Test
    public void newNodeTextIsEmpty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

}
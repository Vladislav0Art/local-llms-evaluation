package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedNewNode_textIsBlankTest {

    @Test
    public void newNode_textIsBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedNewNode_textIsEmptyTest {

    @Test
    public void newNode_textIsEmptyTest() {
        TextNode node = new TextNode(" ");
        assertFalse(node.isBlank());
    }

}
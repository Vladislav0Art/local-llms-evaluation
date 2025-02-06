package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedNewNode_textIsNotEmptyTest {

    @Test
    public void newNode_textIsNotEmptyTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

}
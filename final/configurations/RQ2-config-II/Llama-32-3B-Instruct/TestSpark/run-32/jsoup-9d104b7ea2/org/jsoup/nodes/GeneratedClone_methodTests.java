package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedClone_methodTests {

    @Test
    public void clone_methodTests() {
        String text = "test";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertEquals(text, clone.text());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedClone_ReturnsClone {

    @Test
    public void clone_ReturnsClone() {
        TextNode originalTextNode = new TextNode("test");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals("test", clonedTextNode.text());
    }

}
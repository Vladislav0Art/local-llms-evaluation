package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedCreateFromEncoded_Succeeds {

    @Test
    public void createFromEncoded_Succeeds() {
        TextNode textNode = TextNode.createFromEncoded("test");
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTextTest {

    @Test
    public void TextNodeConstructorTextTest() {
        String testString = "testString";
        TextNode tn = new TextNode(testString);
        assertEquals(testString, tn.text());
    }

}
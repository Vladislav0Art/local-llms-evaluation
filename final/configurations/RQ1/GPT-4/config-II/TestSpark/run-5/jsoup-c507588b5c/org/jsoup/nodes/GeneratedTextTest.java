package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("     Test    ");
        assertEquals("Test", textNode.text());
    }

}
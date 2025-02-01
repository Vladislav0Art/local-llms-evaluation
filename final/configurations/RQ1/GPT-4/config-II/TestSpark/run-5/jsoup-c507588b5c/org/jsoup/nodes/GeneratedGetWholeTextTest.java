package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("     Test    ");
        assertEquals("     Test    ", textNode.getWholeText());
    }

}
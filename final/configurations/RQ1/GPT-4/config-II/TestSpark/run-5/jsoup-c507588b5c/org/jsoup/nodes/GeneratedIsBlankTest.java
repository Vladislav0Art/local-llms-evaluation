package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("     ");
        assertTrue(textNode.isBlank());
    }

}
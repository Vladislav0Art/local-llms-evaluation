package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("     ");
        assertEquals(true, textNode.isBlank());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test Text");
        assertEquals("Test Text", node.text());
    }

}
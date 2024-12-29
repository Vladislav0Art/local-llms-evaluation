package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode node = new TextNode("Test Text");
        assertEquals("Test Text", node.getWholeText());
    }

}
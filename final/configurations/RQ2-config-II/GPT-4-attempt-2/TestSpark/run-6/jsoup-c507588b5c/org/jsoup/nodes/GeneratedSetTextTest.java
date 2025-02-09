package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}
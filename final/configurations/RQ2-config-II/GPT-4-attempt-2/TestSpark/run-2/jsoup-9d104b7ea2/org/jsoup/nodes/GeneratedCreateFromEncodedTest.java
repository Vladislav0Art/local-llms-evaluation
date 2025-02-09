package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void CreateFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("Encoded&amp;Test");
        assertEquals("Encoded&Test", textNode.getWholeText());
    }

}
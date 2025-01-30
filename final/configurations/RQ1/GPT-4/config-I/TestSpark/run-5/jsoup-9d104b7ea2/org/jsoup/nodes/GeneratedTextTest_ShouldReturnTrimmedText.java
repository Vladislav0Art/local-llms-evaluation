package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextTest_ShouldReturnTrimmedText {

    @Test
    public void textTest_ShouldReturnTrimmedText() {
        TextNode textNode = new TextNode("     Lorem ipsum         ");
        assertEquals("Lorem ipsum", textNode.text());
    }

}
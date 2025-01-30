package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedToStringTest_ShouldReturnTheWholeText {

    @Test
    public void toStringTest_ShouldReturnTheWholeText() {
        TextNode textNode = new TextNode("Lorem ipsum");
        assertEquals("Lorem ipsum", textNode.toString());
    }

}
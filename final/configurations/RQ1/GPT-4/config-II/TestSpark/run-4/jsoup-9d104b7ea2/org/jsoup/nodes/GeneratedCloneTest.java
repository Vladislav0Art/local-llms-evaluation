package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Test");
        TextNode cloneNode = textNode.clone();

        assertNotSame(textNode, cloneNode);
        assertEquals(textNode.getWholeText(), cloneNode.getWholeText());
    }

}
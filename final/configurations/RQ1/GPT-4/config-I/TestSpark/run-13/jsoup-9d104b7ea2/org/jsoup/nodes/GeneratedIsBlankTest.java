package org.jsoup.nodes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String testString = "Test text";
        TextNode node = new TextNode(testString);
        assertFalse(node.isBlank());

        TextNode blankNode = new TextNode(" ");
        assertTrue(blankNode.isBlank());
    }

}
package org.jsoup.nodes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String testString = "Test text";
        TextNode node = new TextNode(testString);
        assertEquals(node.toString(), testString);
    }

}
package org.jsoup.nodes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String testString = "&lt;";
        TextNode node = TextNode.createFromEncoded(testString);
        assertEquals(node.text(), "<");
    }

}
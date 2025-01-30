package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("  test  ");
        assertEquals("  test  ", node.getWholeText());
    }

}
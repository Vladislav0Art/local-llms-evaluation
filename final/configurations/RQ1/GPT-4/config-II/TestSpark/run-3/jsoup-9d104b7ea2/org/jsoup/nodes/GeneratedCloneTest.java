package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("some text");
        TextNode cloned = node.clone();
        assertEquals(node.getWholeText(), cloned.getWholeText());
    }

}
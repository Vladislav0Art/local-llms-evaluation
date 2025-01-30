package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode originalTextNode = new TextNode("Clone Test");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

}
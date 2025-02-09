package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneCreatesNewTextNodeWithSameProperties {

    @Test
    public void cloneCreatesNewTextNodeWithSameProperties() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertEquals(node.nodeName(), cloned.nodeName());
        assertEquals(node.text(), cloned.text());
    }

}
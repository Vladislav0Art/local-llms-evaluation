package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneMethodCreatesNewCopyOfTextNodeTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void cloneMethodCreatesNewCopyOfTextNodeTest() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned.parent());
    }

}
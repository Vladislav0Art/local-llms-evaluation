package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCloneCreatesNewTextNodeWithSameTextContent {

    @Test
    public void cloneCreatesNewTextNodeWithSameTextContent() throws IOException {
        Document doc = new Document(new org.jsoup.nodes.DocumentBuilder().append(new TextNode("text"), "other text"));
        TextNode node = doc.body().children().get(0);
        TextNode cloned = (TextNode) node.clone();
        assertEquals("text", cloned.text());
    }

}
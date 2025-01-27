package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextRemovesPartOfTextNode {

    @Test
    public void splitTextRemovesPartOfTextNode() throws IOException {
        Document doc = new Document(new org.jsoup.nodes.DocumentBuilder().append(new TextNode("text"), "other text"));
        TextNode node = doc.body().children().get(0);
        int offset = 4;
        TextNode result = (TextNode) node.splitText(offset);
        assertEquals(5, result.text().length());
    }

}
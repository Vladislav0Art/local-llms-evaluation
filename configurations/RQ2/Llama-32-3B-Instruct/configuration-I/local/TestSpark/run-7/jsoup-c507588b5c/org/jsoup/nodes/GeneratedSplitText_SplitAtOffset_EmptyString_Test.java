package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_SplitAtOffset_EmptyString_Test {

    @Test
    public void splitText_SplitAtOffset_EmptyString_Test() throws IOException {
        TextNode textNode = new TextNode("");
        TextNode node1 = (TextNode) mockText();
        int offset = 0;
        assertEquals(node1, ((TextNode) mockText()).splitText(offset));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedClone_ClonedTextNode_SimpleText_Test {

    @Test
    public void clone_ClonedTextNode_SimpleText_Test() throws IOException {
        String text = "Hello World";
        TextNode textNode1 = new TextNode(text);
        TextNode textNode2 = textNode1.clone();
        assertEquals(text, textNode2.text());
    }

}
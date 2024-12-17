package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetNewTextMethodSetsCorrectValueTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void setNewTextMethodSetsCorrectValueTest() {
        String newText = "New Test";
        TextNode textNode = new TextNode("Old Test");
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}
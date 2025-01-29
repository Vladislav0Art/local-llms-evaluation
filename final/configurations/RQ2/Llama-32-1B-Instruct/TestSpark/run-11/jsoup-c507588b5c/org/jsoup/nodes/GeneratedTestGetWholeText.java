package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");
        element.append(new TextNode(document, element));

        TextNode textNode = new TextNode(document, element);
        String wholeText = textNode.getWholeText();
        assertEquals("test", wholeText);

        textNode = new TextNode(document, element);
        wholeText = textNode.getWholeText();
        assertEquals("test", wholeText);

        textNode = new TextNode(document, element);
        try {
            wholeText = "";
        } catch (Exception e) {
            fail("Failed to throw exception when calling getWholeText() method");
        }
    }

}
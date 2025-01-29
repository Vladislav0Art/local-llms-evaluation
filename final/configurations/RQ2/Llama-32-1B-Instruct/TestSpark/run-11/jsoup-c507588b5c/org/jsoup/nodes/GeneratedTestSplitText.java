package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);

        try {
            textNode.splitText(0);
        } catch (Exception e) {
            fail("Failed to throw exception when calling splitText() method");
        }

        try {
            textNode.splitText(1);
        } catch (Exception e) {
            fail("Failed to throw exception when calling splitText() method");
        }
    }

}
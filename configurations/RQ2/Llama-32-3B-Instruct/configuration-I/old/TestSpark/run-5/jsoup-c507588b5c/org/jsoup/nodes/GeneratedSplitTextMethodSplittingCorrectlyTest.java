package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextMethodSplittingCorrectlyTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void splitTextMethodSplittingCorrectlyTest() throws IOException {
        String text = "Hello World";
        int offset = 5;
        Document document = createDocument("text=" + text);
        Element parentElement = (Element) document.head().firstChild();
        TextNode parentTextNode = new TextNode(parentElement.text());
        assertEquals(parentTextNode, parentTextNode.splitText(offset).parent());
    }

}
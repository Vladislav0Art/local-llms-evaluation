package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest clone {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    clone() {
        TextNode node1 = createTextNode(testText);
        TextNode node2 = clone(node1);
        assertEquals(node1, getNode(0));
        assertEquals(node2, getNode(0));
    }

    private static TextNode clone(TextNode node) {
        Document document = new Document();
        appendText(document, "");
        Element parent = document.createElement("body");
        parent.appendChild(document);
        parent.appendChild(node);
        return createTextNode(document.body().text());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    public static int getNodeName(int index) {
        return getNode(0).getAttribute("nodeName");
    }

    public static String getNodeText(int index) {
        return getNode(0).text();
    }

    public static TextNode createTextNode(String text) {
        Element node = document.createElement("span");
        node.setText(text);
        return (TextNode) node;
    }

}
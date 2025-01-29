package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest splitText {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    splitText() {
        TextNode node1 = createTextNode(testText + "\n" + testSubstring);
        TextNode node2 = createTextNode(testSubstring);
        assertEquals(node1, getNode(0));
        assertEquals(node2, getNode(1));
    }

    private static String getWholeText(int index) {
        StringBuilder builder = new StringBuilder();
        appendText(document, "");
        while (index < document.body().length()) {
            if (document.body().contains(index)) {
                builder.append(document.body().substring(index).trim());
            }
            index++;
        }
        return builder.toString();
    }

}
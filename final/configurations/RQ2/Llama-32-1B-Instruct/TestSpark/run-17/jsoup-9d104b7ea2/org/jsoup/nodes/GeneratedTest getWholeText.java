package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest getWholeText {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    getWholeText() {
        Document document = new Document();
        appendText(document, testText + "\n" + testSubstring);
        assertEquals(getWholeText(0), document.getText(0, document.getLength()));
    }

}
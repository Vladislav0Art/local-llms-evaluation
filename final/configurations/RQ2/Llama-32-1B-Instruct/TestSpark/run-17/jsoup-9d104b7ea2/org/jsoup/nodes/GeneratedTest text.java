package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest text {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    text() {
        assertEquals(testText, getNodeText(0));
    }

}
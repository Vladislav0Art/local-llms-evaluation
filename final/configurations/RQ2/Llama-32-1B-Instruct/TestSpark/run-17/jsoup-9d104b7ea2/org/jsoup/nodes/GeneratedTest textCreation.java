package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest textCreation {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    textCreation() {
        TextNode createdNode = createTextNode(testSubstring);
        assertEquals(createdNode, getNode(0));
    }

}
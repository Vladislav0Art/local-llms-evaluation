package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest isBlank {

    public static String testText = "Hello World";
    public static String testSubstring = "World";

    @Before
    public void setup() {
        document = new Document();
    }

    @Test
    public void test

    isBlank() {
        assertTrue(isBlank(0));
    }

    private static boolean isBlank(int index) {
        return getNodeName(index).equals("br");
    }

}
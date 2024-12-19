package org.jsoup.nodes;

public class GeneratedTestEmptyStringWithEscapedChars {

    @Test
    public void testEmptyStringWithEscapedChars() {
        TextNode textNode = new TextNode("a");
        assertTrue(textNode.text().contains("\u0009"));
    }
}

class Utils {
    public static String fromHtml(String html) {
        // implementation
    }

}
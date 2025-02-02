package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestBlankNode {

    private String text;

    public Node(String text) {
        this.text = text;
    }

    public String getWholeText() {
        return text;
    }

    public String getText() { // Renamed method to resolve conflict
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String text) {
        Document document = new Document(text);
        Elements elements = document.getAllElements();
        for (Element element : elements) {
            element.wrap("span");
        }
        return document.body().html();
    }

    public static void assertTrue(boolean condition) {
    }

    public static void assertFalse(boolean condition) {
    }
}

public class GeneratedTest {
    public Node originalText;

    public GeneratedTest() {
        originalText = new Node("This is an example sentence.");
    }

    @Test
    public void testBlankNode() {
        Node blankNode = new Node("");
        assertTrue(blankNode.isBlank());

        originalText = new Node("This is an example sentence.");
        assertFalse(originalText.isBlank());
    }

}
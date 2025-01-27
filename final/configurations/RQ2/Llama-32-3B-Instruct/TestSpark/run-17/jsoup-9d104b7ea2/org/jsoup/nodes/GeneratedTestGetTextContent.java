package org.jsoup.nodes;

public class GeneratedTestGetTextContent {

    public static String normalizeWhitespace(String input) {
        return input.replaceAll("\\s+", " ");
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder) {
        if (builder.length() == 0) {
            return true;
        }
        char lastChar = builder.charAt(builder.length() - 1);
        return Character.isWhitespace(lastChar);
    }
}

public class GeneratedTest {

    @Test
    public void testGetTextContent() {
        Document document = Jsoup.parse("<div>Hello World!</div>");
        Element element = document.body().child(0);
        String textContent = element.text();
        assertEquals("Hello World!", textContent);
    }

}
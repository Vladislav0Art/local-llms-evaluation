package org.jsoup.nodes;

public class GeneratedTestNormalizeWhitespace {

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
    public void testNormalizeWhitespace() {
        Document document = Jsoup.parse("<div>   Hello   World!   </div>");
        Document normalizedDocument = Jsoup.parse(document.html());
        Element element = normalizedDocument.body().child(0);
        String text = element.text();
        assertEquals("Hello World!", StringUtil.normalizeWhitespace(text));
    }

}
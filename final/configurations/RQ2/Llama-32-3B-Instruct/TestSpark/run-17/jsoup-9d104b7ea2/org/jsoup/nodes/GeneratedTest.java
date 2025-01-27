package org.jsoup.nodes;

public class GeneratedTest {

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
    public void testGenerated() {
        Document document = Jsoup.parse("<div><span>Hello</span> <span>World!</span></div>");
        assertNotNull(document.body().children());
    }

    @Test
    public void testGetTextContent() {
        Document document = Jsoup.parse("<div>Hello World!</div>");
        Element element = document.body().child(0);
        String textContent = element.text();
        assertEquals("Hello World!", textContent);
    }

    @Test
    public void testNormalizeWhitespace() {
        Document document = Jsoup.parse("<div>   Hello   World!   </div>");
        Document normalizedDocument = Jsoup.parse(document.html());
        Element element = normalizedDocument.body().child(0);
        String text = element.text();
        assertEquals("Hello World!", StringUtil.normalizeWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() {
        Document document = Jsoup.parse("<div>   Hello World! </div>");
        Document strippedDocument = Jsoup.parse(document.html());
        Element element = strippedDocument.body().child(0);
        String text = element.text();
        assertEquals("Hello World!", StringUtil.normalizeWhitespace(text));
    }

    @Test
    public void testLastCharIsWhitespace() {
        Document document = Jsoup.parse("<div>   Hello World!</div>");
        Document strippedDocument = Jsoup.parse(document.html());
        Element element = strippedDocument.body().child(0);
        String text = element.text();
        assertFalse(StringUtil.lastCharIsWhitespace(new StringBuilder(text)));
    }

    @Test
    public void testClonedTextNode() {
        Document document = Jsoup.parse("<div>Hello World!</div>");
        Element clonedElement = document.clone();
        assertNotNull(clonedElement.body().child(0));
    }

}
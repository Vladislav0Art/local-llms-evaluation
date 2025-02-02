package org.jsoup.nodes;

public class GeneratedTestResult {

    public static String nodeName(Element element) {
        return element.nodeName();
    }

    public static boolean isBlank(String text) {
        return text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testResult() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        String result = Jsoup.parse(textNode.outerHtml()).body().text();
        assertNotNull(result);
        assertEquals(text, result);
    }

}
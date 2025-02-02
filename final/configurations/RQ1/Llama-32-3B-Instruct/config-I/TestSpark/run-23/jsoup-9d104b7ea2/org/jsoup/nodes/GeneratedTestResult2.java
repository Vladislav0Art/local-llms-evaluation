package org.jsoup.nodes;

public class GeneratedTestResult2 {

    public static String nodeName(Element element) {
        return element.nodeName();
    }

    public static boolean isBlank(String text) {
        return text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testResult2() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        Object result = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling());
        assertNotNull(result);
        assertTrue(((Element) result).isEmpty());
    }

}
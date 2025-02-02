package org.jsoup.nodes;

public class GeneratedTestGeneratedNodes2 {

    public static String nodeName(Element element) {
        return element.nodeName();
    }

    public static boolean isBlank(String text) {
        return text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testGeneratedNodes2() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        Object result = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling());
        assertNotNull(result);
        assertEquals(textNode, (Element) result);
    }

}
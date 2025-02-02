package org.jsoup.nodes;

public class GeneratedTestGeneratedNodes {

    public static String nodeName(Element element) {
        return element.nodeName();
    }

    public static boolean isBlank(String text) {
        return text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testGeneratedNodes() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        String text = textNode.text();
        assertNotNull(text);
        assertEquals(ElementUtils.nodeName(textNode), "#text");
        assertTrue(ElementUtils.isBlank(textNode.text()));
    }

}
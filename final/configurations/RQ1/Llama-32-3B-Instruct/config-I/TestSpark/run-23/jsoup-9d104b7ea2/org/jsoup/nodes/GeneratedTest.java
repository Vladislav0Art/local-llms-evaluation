package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void testResult() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        String result = Jsoup.parse(textNode.outerHtml()).body().text();
        assertNotNull(result);
        assertEquals(text, result);
    }

    @Test
    public void testTailNodes() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        String tailText = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling()).text();
        assertNotNull(tailText);
        assertEquals(5, tailText.length());
    }

    @Test
    public void testResult2() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        Object result = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling());
        assertNotNull(result);
        assertTrue(((Element) result).isEmpty());
    }

    @Test
    public void testGeneratedNodes2() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        Object result = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling());
        assertNotNull(result);
        assertEquals(textNode, (Element) result);
    }

}
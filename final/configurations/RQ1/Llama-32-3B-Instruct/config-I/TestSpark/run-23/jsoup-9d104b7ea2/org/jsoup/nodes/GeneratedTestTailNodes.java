package org.jsoup.nodes;

public class GeneratedTestTailNodes {

    public static String nodeName(Element element) {
        return element.nodeName();
    }

    public static boolean isBlank(String text) {
        return text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testTailNodes() {
        Document document = Jsoup.parse("<html><body>text</body></html>");
        Element textNode = document.selectFirst("body").selectFirst("text");
        String tailText = ((Element) Jsoup.parse(textNode.outerHtml()).body().nextElementSibling()).text();
        assertNotNull(tailText);
        assertEquals(5, tailText.length());
    }

}
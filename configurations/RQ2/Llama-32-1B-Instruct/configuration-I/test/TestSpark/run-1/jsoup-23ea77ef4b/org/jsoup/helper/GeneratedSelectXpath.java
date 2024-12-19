package org.jsoup.helper;

public class GeneratedSelectXpath {

    private org.jsoup.nodes.Document document;

    @Test
    public void selectXpath() {
        document = org.jsoup.select.Document.parse("Hello <span>World!</span>");
        NodeList result = W3CDom.selectXpath("s[lang='en']", document);
        assertNotNull(result);
        assertEquals(1, result.size());
        Node contextNode = (Node) result.get(0);
        assertTrue(contextNode instanceof org.jsoup.nodes.Element);
    }

}
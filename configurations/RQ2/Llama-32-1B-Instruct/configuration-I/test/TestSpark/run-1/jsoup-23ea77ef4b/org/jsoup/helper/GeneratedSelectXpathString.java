package org.jsoup.helper;

public class GeneratedSelectXpathString {

    private org.jsoup.nodes.Document document;

    @Test
    public void selectXpathString() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        NodeList result = W3CDom.selectXpath("s[lang='en']", document);
        assertNotNull(result);
        assertEquals(1, result.size());
        Node contextNode = (Node) result.get(0);
        assertTrue(contextNode instanceof org.jsoup.nodes.Element);
    }

}
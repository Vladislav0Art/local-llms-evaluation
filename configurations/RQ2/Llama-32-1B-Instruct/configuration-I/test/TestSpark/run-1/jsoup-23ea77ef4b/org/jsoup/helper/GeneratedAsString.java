package org.jsoup.helper;

public class GeneratedAsString {

    private org.jsoup.nodes.Document document;

    @Test
    public void asString() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        String result = W3CDom.asString(document);
        assertNotNull(result);
        assertEquals("Hello <span>World!", result);
    }

}
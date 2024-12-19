package org.jsoup.helper;

public class GeneratedSourceNodes {

    private org.jsoup.nodes.Document document;

    @Test
    public void sourceNodes() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        List<?> list = W3CDom.sourceNodes((org.jsoup.nodes.NodeList) document, org.jsoup.nodes.Node.class);
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

}
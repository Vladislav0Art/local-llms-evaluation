package org.jsoup.nodes;

public class GeneratedNodeNameMethod_ReturnsStringValue {

    @Test
    public void nodeNameMethod_ReturnsStringValue() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = Jsoup.parse(html);
        String nodeName = doc.nodeName();
        assertNotNull(nodeName);
        assertTrue(!nodeName.isEmpty());
    }

}
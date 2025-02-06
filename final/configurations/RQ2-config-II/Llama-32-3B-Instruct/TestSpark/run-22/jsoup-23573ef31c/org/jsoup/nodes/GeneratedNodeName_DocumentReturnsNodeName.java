package org.jsoup.nodes;

public class GeneratedNodeName_DocumentReturnsNodeName {

    @Test
    public void nodeName_DocumentReturnsNodeName() {
        String nodeName = "element";
        Element element = mock(Element.class);
        when(element.getNodeName()).thenReturn(nodeName);
        Document document = new Document("https://example.com");
        assertEquals(nodeName, document.nodeName());
    }

}
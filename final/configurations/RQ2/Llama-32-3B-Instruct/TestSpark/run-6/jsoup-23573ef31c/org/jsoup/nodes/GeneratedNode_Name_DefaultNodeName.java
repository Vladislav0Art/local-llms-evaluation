package org.jsoup.nodes;

public class GeneratedNode_Name_DefaultNodeName {

    @Test
    public void node_Name_DefaultNodeName() {
        String html = "<html><head><title>Document</title></head></html>";
        Document document = new Document(html);
        assertEquals("html", document.nodeName());
    }

}
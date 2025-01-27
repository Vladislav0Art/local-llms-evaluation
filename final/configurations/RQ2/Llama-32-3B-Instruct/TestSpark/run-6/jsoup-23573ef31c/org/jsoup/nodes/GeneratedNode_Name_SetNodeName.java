package org.jsoup.nodes;

public class GeneratedNode_Name_SetNodeName {

    @Test
    public void node_Name_SetNodeName() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document(html);
        document.nodeName("NewNode");
        assertEquals("NewNode", document.nodeName());
    }
}

}
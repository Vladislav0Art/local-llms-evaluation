package org.jsoup.helper;

public class GeneratedTestContextNode {

    private String id;
    private Document wDoc;

    public W3CDom(String id) {
        this.id = id;
        this.wDoc = new Document();
    }

    public Node contextNode(Document doc) {
        Element element = doc.createElement("div");
        return new Node(element);
    }
}

class Node {
    private Element element;

    public Node(Element element) {
        this.element = element;
    }
}

public class TestW3CDom {

    @Test
    public void testContextNode() {
        W3CDom w3cDom = new W3CDom("id");
        Document doc = w3cDom.wDoc;
        Element element = w3cDom.contextNode(doc);
        assertTrue(element instanceof org.jsoup.nodes.Element);

        assertEquals("<div>", element.outerHtml());
    }

}
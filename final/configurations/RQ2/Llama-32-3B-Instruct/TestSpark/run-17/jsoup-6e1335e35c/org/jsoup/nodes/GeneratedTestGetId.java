package org.jsoup.nodes;

public class GeneratedTestGetId {

    private String id;
    private Document document;

    public Element(String html) {
        // parse HTML into DOM
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public Element clone() {
        // create a shallow copy
        return new Element(getHtml());
    }
}

public class TestElement {

    @Test
    public void testGetId() {
        Element element = new Element("<div id='test'></div>");
        assertEquals("test", element.getId());
    }

}
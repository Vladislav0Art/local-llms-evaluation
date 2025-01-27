package org.jsoup.nodes;

public class GeneratedTest {

    private String html;

    public TestElement(String html) {
        this.html = html;
    }

    public Element createElement() {
        return new Element(html);
    }
}

class Element {
    private String html;

    public Element(String html) {
        this.html = html;
    }

    public boolean hasClass(String className) {
        return html.contains(" " + className + " ");
    }

    public void setAttribute(String attributeName, String attributeValue) {
        html = html.replace(attributeName + "=\"\"", attributeValue + "\"");
    }

    public String getAttribute(String attributeName) {
        return html.split("\"")[1].split("=")[1];
    }
}

public class TestElementTest {

}
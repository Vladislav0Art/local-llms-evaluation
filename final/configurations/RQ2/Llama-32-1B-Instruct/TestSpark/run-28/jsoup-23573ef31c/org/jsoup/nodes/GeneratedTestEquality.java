package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestEquality {

    public static void main(String[] args) {
        Document document = new Document("https://example.com");

        assertEquals(0, document.forms().size());
    }

    @Test
    public void testEquality() {
        assertEquals("https://example.com", "https://example.com");
        assertEquals(null, null);
        assertEquals(0, 0);

        Element head = document.head();
        assertNotNull(head);
        assertTrue(head.tagName().equals("head"));

        Element body = document.body();
        assertNotNull(body);
        assertTrue(body.tagName().equals("body"));

        String title = document.title();
        assertEquals("", "");

        FormElement formElement = document.expectForm("#my-form");
        assertNotNull(formElement);

        Element form = formElement.form();
        assertNotNull(form);
        assertTrue(form.tagName().equals("form"));
    }

    public static void testGetText() {
        Document document = new Document("https://example.com");
        String text = document.getText();
        assertEquals("", "");

        TextElement element = document.createElement("text");
        element.textContent = "Example Title";
        Element body = document.body();
        body.appendChild(element);
        assertTrue(document.getText().contains("Example Title"));
    }

    public static void testGetAttribute() {
        Document document = new Document("https://example.com");
        String attribute = document.getAttribute("class");
        assertEquals("", "");

        TextElement element = document.createElement("text");
        element.attr("class", "public-class");
        Element body = document.body();
        body.appendChild(element);
        assertTrue(document.getText().contains("public-class"));
    }

    public static void testGetAllElements() {
        Document document = new Document("https://example.com");
        Elements elements = document.getAllElements();
        for (Element element : elements) {
            System.out.println(element.tagName());
        }
    }

    public static void testGetAttributeOfFirstElement() {
        Document document = new Document("https://example.com");
        String attribute = document.getAttribute("#my-id");
        assertEquals("", "");

        Element element = document.getElementById("my-id");
        assertTrue(element.hasAttr(attribute));
        System.out.println(element.attr(attribute));
    }
}

class TextElement extends Element {
    public void setTextContent(String text) {
        this.textContent = text;
    }

    @Override
    public String getAttribute(String name) {
        return super.getAttribute(name);
    }

    @Override
    public String getText() {
        return super.getText();
    }

}
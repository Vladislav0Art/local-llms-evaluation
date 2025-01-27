package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testElementCreation() {
        Element element = new Element();
        assertEquals(null, element.getClass());
    }

    @Test
    public void testTextAttribute() {
        Element element = new Element();
        element.setText("Hello World");
        assertEquals("Hello World", element.getText());
    }

    @Test
    public void testHtmlAttribute() {
        Element element = new Element();
        element.setHtml("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", element.getHtml());
    }

    @Test
    public void testStylesAttribute() {
        Element element = new Element();
        element.setStyles("color: red; font-size: 16px");
        assertEquals("color: red; font-size: 16px", element.getStyles());
    }
}

class Element {

    private String text;
    private String html;
    private String styles;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public String getStyles() {
        return styles;
    }

}
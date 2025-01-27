package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGetHtml() {
        Element element = new Element("");
        assertEquals("", element.getHtml());
    }

    @Test
    public void testSetHtml() {
        Element element = new Element("");
        element.setHtml("<p>Hello World!</p>");
        assertEquals("<p>Hello World!</p>", element.getHtml());
    }
}

@Test
public void testGetText() {
    TextElement element = new TextElement("", "Hello World!");
    assertEquals("Hello World!", element.getText());
}

@Test
public void testSetText() {
    TextElement element = new TextElement("", "");
    element.setText("Hello World!");
    assertEquals("Hello World!", element.getText());
}

}
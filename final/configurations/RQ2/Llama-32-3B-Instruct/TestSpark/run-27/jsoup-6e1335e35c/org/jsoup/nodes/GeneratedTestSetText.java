package org.jsoup.nodes;

public class GeneratedTestSetText {

    @Test
    public void testSetText() {
        TextElement element = new TextElement("", "");
        element.setText("Hello World!");
        assertEquals("Hello World!", element.getText());
    }

}
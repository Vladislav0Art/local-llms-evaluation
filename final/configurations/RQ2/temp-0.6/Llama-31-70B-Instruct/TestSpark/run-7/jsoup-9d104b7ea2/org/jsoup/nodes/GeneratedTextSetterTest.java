package org.jsoup.nodes;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Test");
        TextNode newTextNode = textNode.text("New Test");
        assertEquals("New Test", newTextNode.text());
    }

}
package org.jsoup.nodes;

public class GeneratedTextModifyTest {

    @Test
    public void textModifyTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("modified");
        assertEquals("modified", textNode.text());
    }

}
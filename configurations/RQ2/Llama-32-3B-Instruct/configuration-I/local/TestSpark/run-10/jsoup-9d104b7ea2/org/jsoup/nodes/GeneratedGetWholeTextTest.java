package org.jsoup.nodes;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello\nWorld", textNode.getWholeText());

        text = "Hello World";
        textNode = new TextNode();
        assertNull(textNode.getWholeText());
    }

}
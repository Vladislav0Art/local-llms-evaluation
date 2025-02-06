package org.jsoup.nodes;

public class GeneratedText AssignNewText_UpdatesTextNodeText {

    @Test
    public void text

    AssignNewText_UpdatesTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        textNode.text("Good Bye World");
        assertEquals("Good Bye World", textNode.text());
    }

}
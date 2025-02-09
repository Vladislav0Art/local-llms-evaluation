package org.jsoup.nodes;

public class GeneratedAppendText_appendTextIsCorrect {

    @Test
    public void appendText_appendTextIsCorrect() {
        TextNode textNode = new TextNode("");
        String expected = "text";
        textNode.text(expected);
        assertEquals(expected, textNode.text());
    }

}
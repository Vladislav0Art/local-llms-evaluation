package org.jsoup.nodes;

public class GeneratedAppendText appendTextIsCorrect {

    @Test
    public void appendText

    appendTextIsCorrect() {
        TextNode textNode = new TextNode("text");
        String expected = "text";
        textNode.text(expected);
        assertEquals(expected, textNode.text());
    }

}
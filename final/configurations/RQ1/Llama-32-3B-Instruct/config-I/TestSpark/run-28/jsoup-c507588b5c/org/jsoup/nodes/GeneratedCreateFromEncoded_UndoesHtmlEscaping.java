package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_UndoesHtmlEscaping {

    @Test
    public void createFromEncoded_UndoesHtmlEscaping() {
        String encodedText = "&lt;Hello World!&gt;";
        String rawText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(rawText, textNode.text());
    }

}
package org.jsoup.nodes;

public class GeneratedText_SettingTextNode_TextIsReturned {

    @Test
    public void text_SettingTextNode_TextIsReturned() {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode();
        textNode.text(text);

        // Assert
        assertEquals(text, textNode.text());
    }

}
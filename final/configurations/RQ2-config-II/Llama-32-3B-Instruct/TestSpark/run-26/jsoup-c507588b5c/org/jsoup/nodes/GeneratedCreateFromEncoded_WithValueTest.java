package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_WithValueTest {

    @Test
    public void createFromEncoded_WithValueTest() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

}
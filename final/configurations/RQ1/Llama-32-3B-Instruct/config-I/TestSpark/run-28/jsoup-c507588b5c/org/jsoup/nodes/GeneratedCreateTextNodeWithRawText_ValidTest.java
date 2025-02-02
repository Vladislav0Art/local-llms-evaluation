package org.jsoup.nodes;

public class GeneratedCreateTextNodeWithRawText_ValidTest {

    @Test
    public void createTextNodeWithRawText_ValidTest() {
        String rawText = "Hello World";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.text());
        assertNotNull(textNode.parentNode());
    }

}
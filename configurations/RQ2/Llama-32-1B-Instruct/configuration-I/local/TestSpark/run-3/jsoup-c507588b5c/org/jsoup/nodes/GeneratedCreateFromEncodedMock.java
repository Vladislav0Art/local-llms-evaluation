package org.jsoup.nodes;

public class GeneratedCreateFromEncodedMock {

    @Test
    public void createFromEncodedMock() throws Exception {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("text", textNode.getText());

        verify(mock(TextNode.class), times(1)).createFromEncoded(encodedText);
    }

}
package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_ParsesEncodedText {

    @Test
    public void createFromEncoded_ParsesEncodedText() {
        // Given
        String encodedText = "<b>Hello</b> World";

        // When
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Then
        assertNotNull(result);
        assertEquals("&lt;b&gt;Hello&lt;/b&gt; World", result.text());
    }

}
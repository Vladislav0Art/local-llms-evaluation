package org.jsoup.nodes;

public class GeneratedSplitTextSplitsTextNodeAtGivenOffset {

    @Test
    public void splitTextSplitsTextNodeAtGivenOffset() throws IOException {
        // Given
        String text = "Hello World";
        int offset = 5;
        TextNode textNode = new TextNode(text);

        // When
        String[] splits = textNode.splitText(offset).text().split(" ", 1);

        // Then
        assertEquals(new String[]{text.substring(0, offset), text.substring(offset)}, splits);
    }

}
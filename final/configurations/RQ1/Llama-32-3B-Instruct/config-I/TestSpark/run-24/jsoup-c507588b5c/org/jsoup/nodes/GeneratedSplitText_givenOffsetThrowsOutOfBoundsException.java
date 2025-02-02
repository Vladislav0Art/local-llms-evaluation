package org.jsoup.nodes;

public class GeneratedSplitText_givenOffsetThrowsOutOfBoundsException {

    @Test
    public void splitText_givenOffsetThrowsOutOfBoundsException() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThrows(IndexOutOfBoundsException.class, () -> testSplitTextExceedsLength(text, textNode));
    }

    private void testSplitTextExceedsLength(String text, TextNode textNode) {
        int offset = Integer.MAX_VALUE;
        assertThrows(IndexOutOfBoundsException.class, () -> splitText(text, offset, textNode));
    }

}
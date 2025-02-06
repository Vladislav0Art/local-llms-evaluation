package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void outerHtmlTailTest() {
        // Mock Appendable to avoid actual implementation
        Appendable accum = mock(Appendable.class);

        TextNode node = new TextNode(WHITESPACE);
        new TextNode().outerHtmlTail(accum, 0);

        verify(accum).append(String.valueOf("\n"));
    }

}
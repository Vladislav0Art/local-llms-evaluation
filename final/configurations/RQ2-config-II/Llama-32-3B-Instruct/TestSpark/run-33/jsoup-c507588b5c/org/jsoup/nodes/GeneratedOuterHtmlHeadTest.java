package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadTest {

    private static final String WHITESPACE = "   ";
    private static final String BLANK = "";
    private static final String EMPTY_STRING = "";

    @Test
    public void outerHtmlHeadTest() throws IOException {
        // Mock Appendable and Document.OutputSettings to avoid actual implementation
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        TextNode node = new TextNode(WHITESPACE);
        new TextNode().outerHtmlHead(accum, 0, out);

        verify(accum).append(String.valueOf("\n" + WHITESPACE));
    }

}
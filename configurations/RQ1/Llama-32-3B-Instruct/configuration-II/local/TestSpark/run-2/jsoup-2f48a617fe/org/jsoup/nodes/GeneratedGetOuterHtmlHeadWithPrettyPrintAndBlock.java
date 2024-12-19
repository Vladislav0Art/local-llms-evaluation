package org.jsoup.nodes;

public class GeneratedGetOuterHtmlHeadWithPrettyPrintAndBlock {

    @Test
    public void getOuterHtmlHeadWithPrettyPrintAndBlock() {
        // given:
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);
        String data = "Hello, World!";

        when(parentNode.tag()).thenReturn(mock(Tag.class));

        // when:
        comment.outerHtmlHead(accum, depth, out);

        // verify:
        verify(accum).append(anyString());
        verify(out).prettyPrint();
    }

}
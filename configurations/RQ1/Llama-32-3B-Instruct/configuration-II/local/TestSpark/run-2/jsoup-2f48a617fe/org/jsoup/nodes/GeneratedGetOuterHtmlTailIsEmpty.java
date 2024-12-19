package org.jsoup.nodes;

public class GeneratedGetOuterHtmlTailIsEmpty {

    @Test
    public void getOuterHtmlTailIsEmpty() {
        // given:
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;

        // when:
        comment.outerHtmlTail(accum, depth, out);

        // verify:
        verify(accum).append(anyString());
    }

}
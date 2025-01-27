package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadWritesToAccum {

    private Appendable accum;

    @org.junit.Before
    public void setUp() {
        this.accum = mock(Appendable.class);
    }

    @Test
    public void outerHtmlHeadWritesToAccum() throws IOException {
        when(new Comment("data")).outerHtmlHead(accum, 0, null);
        verify(accum).append(eq("<comment>data</comment>"));
    }

}
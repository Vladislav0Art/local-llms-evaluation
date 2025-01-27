package org.jsoup.nodes;

public class GeneratedOuterHtmlTailWriteToAccum {

    private Appendable accum;

    @org.junit.Before
    public void setUp() {
        this.accum = mock(Appendable.class);
    }

    @Test
    public void outerHtmlTailWriteToAccum() {
        new Comment("").outerHtmlTail(accum, 0, null);
        verify(accum).append(eq("</comment>"));
    }
}

public class DocumentTest {

    private static final String HTML = "<!-- comment -->";

    @org.junit.Before
    public void setUp() throws IOException {
        // no setup needed
    }

}
package org.jsoup.nodes;

public class GeneratedToStringIncludesCommentData {

    private Appendable accum;

    @org.junit.Before
    public void setUp() {
        this.accum = mock(Appendable.class);
    }

    @Test
    public void toStringIncludesCommentData() {
        when(new Comment(HTML)).clone().toString().contains("<!--");
        when(new Comment(HTML)).clone().toString().endsWith("-->");
        assertDoesNotThrow(() -> assertTrue(document.toString().contains("<!--")));
        assertDoesNotThrow(() -> assertTrue(document.toString().endsWith("-->")));
    }

}
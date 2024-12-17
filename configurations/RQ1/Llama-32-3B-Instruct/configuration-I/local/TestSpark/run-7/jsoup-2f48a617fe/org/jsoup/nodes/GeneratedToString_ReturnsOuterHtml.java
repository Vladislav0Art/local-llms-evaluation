package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("");
        String result = comment.toString();
        assertEquals(3, result.length());
        assertEquals("<!--", result.charAt(0));
    }

}
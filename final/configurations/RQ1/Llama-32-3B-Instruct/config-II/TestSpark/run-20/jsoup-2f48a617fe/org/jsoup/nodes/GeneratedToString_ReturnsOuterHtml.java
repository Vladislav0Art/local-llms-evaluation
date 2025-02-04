package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        Comment comment = new Comment("Hello World");
        String expected = "<!--Hello World-->";
        assertEquals(expected, comment.toString());
    }

}
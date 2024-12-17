package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        org.jsoup.nodes.Appendable accum = new org.jsoup.nodes.Appendable();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        String toStringResult = comment.toString();
        assertNotNull(toStringResult);
    }

}
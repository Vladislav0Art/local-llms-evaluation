package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String data = "This is a new value for the comment";
        Comment comment = new Comment(data);
        assertEquals("outerHtml", comment.toString());
    }

}
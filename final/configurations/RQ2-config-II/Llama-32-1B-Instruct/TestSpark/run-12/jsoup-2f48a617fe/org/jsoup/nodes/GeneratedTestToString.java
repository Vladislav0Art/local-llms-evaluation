package org.jsoup.nodes;

public class GeneratedTestToString {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testToString() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("<!-- comment -->", comment.toString());
    }

}
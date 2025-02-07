package org.jsoup.nodes;

public class GeneratedTestClone {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testClone() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}
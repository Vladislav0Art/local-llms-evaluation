package org.jsoup.nodes;

public class GeneratedToStringTest {

    private Comment comment;

    @Test
    public void toStringTest() {
        comment = new Comment("data");
        assertEquals("Comment[data]", comment.toString());
    }

}
package org.jsoup.nodes;

public class GeneratedCreateCommentTest {

    @Test
    public void createCommentTest() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
    }

}
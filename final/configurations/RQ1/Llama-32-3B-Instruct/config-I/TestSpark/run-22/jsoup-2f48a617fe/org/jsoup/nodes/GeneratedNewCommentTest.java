package org.jsoup.nodes;

public class GeneratedNewCommentTest {

    @Test
    public void newCommentTest() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("Hello World!", comment.getData());
    }

}
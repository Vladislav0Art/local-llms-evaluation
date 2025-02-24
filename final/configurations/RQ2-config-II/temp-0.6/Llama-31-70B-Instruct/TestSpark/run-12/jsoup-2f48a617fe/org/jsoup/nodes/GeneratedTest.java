package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Test
    public void nodeNameTest() {
        comment = new Comment("This is a comment");
        assertEquals("#comment", comment.nodeName());
    }

}
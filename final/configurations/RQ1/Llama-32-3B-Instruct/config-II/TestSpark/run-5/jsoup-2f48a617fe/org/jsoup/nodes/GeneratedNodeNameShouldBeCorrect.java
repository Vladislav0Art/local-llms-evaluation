package org.jsoup.nodes;

public class GeneratedNodeNameShouldBeCorrect {

    private Comment comment;

    @Test
    public void nodeNameShouldBeCorrect() {
        comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

}
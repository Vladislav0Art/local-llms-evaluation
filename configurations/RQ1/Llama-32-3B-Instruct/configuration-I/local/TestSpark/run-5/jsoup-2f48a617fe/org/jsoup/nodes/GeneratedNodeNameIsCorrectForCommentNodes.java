package org.jsoup.nodes;

public class GeneratedNodeNameIsCorrectForCommentNodes {

    @Test
    public void nodeNameIsCorrectForCommentNodes() {
        Comment comment = new Comment("This is a test");
        assertEquals("#comment", comment.nodeName());
    }

}
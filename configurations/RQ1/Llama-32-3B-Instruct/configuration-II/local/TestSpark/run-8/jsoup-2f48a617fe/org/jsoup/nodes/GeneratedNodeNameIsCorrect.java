package org.jsoup.nodes;

public class GeneratedNodeNameIsCorrect {

    @Test
    public void nodeNameIsCorrect() {
        Comment comment = new Comment("This is a test comment.");
        assertEquals("#comment", comment.nodeName());
    }

}
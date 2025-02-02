package org.jsoup.nodes;

public class GeneratedNodeNameIsCorrectlyDefined {

    @Test
    public void nodeNameIsCorrectlyDefined() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

}
package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration Returns false for
a normal

comment {

    @Test
    public void isXmlDeclaration Returns false for a normal comment() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

}
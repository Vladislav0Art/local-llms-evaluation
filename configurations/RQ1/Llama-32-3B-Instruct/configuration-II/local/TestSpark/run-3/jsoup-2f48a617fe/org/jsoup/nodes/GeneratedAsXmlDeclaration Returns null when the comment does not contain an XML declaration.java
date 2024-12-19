package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration Returns null
when the
comment does
not contain
an XML

declaration {

    @Test
    public void asXmlDeclaration Returns null when the comment does not contain an XML declaration() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}
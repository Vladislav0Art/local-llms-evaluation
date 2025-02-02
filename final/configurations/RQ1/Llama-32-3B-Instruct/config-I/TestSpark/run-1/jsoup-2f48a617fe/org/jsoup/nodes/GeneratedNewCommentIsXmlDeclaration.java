package org.jsoup.nodes;

public class GeneratedNewCommentIsXmlDeclaration {

    @Test
    public void newCommentIsXmlDeclaration() {
        Comment comment = new Comment("!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        assertTrue(comment.isXmlDeclaration());
    }

}
package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldBeTrueIfDataStartsWithCommentDeclaringChars {

    private Comment comment;

    @Test
    public void isXmlDeclarationShouldBeTrueIfDataStartsWithCommentDeclaringChars() {
        comment = new Comment("/* This is an XML Declaration */");
        assertTrue(comment.isXmlDeclaration());
    }

}
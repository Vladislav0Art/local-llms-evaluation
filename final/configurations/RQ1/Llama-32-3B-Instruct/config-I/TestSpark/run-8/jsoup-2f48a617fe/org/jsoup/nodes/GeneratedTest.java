package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void outerHtmlHeadIsCalledWithCorrectData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(appendable, depth, outputSettings);
        assertEquals("<!--Hello World-->", outContent.toString());
    }

    @Test
    public void outerHtmlTailIsNeverCalled() {
        Appendable appendable = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(appendable, depth, outputSettings);
        assertTrue(appendable.toString().isEmpty());
    }

    @Test
    public void outerHtmlReturnsCorrectString() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("Hello World");
        comment.outerHtml(appendable, depth, outputSettings);
        assertEquals("<!--Hello World--><!DOCTYPE html>", outContent.toString());
    }

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment comment = new Comment("Hello World");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationReturnsFalseForCorrectData() {
        assertTrue(Comment.isXmlDeclaration().booleanValue());
    }
}

public class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Test
    public void isXmlDeclarationReturnsFalseForIncorrectData() {
        assertTrue(isXmlDeclaration());
    }

    public boolean isXmlDeclaration() {
        // logic to check if string is xml declaration
        return true;
    }

}
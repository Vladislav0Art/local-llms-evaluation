package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedTest {

    @Test
    public void constructorHasCorrectDataTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameReturnsCorrectNameTest() {
        Comment comment = new Comment("data");
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void setDataChangesDataCorrectlyTest() {
        String data = "Old data";
        Comment comment = new Comment(data);
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHeadIncludesCommentTest() {
        StringBuilder sb = new StringBuilder();
        Appendable accum = sb;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(sb.toString().contains("<!-- data -->"));
    }

    @Test
    public void outerHtmlTailDoesNotIncludeCommentTest() {
        StringBuilder sb = new StringBuilder();
        Appendable accum = sb;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        assertFalse(sb.toString().contains("<!-- data -->"));
    }

    @Test
    public void toStringIncludesCommentDataCorrectlyTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals("<!-- This is a comment -->", comment.toString());
    }

    @Test
    public void cloneCreatesNewCommentWithSameDataTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationReturnsCorrectResultTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsOptionalWithCorrectDataTest() {
        Comment comment = new Comment("data");
        Optional<XmlDeclaration> result = comment.asXmlDeclaration();
        assertEquals(Optional.of(comment.asXmlDeclaration()), result);
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void createCommentWithData() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

    @Test
    public void commentNodeNameIsComment() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void commentDataIsSetCorrectly() {
        Comment comment = new Comment("data");
        Comment setComment = new Comment("new data");
        setComment.setData(comment.getData());
        assertEquals("new data", setComment.getData());
    }

    @Test
    public void outerHtmlHeadWithDepthOne() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 1, Document.OutputSettings.DEFAULT);
        assertTrue(outContent.toString().contains("<!-- data -->"));
    }

    @Test
    public void outerHtmlTailWithoutDepthIsEmpty() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, Document.OutputSettings.DEFAULT);
        assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void cloneCommentReturnsNewInstance() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment, cloned);
    }

    @Test
    public void isXmlDeclarationIsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsOptionalComment() {
        Comment comment = new Comment("data");
        Optional<Comment> optionalComment = comment.asXmlDeclaration();
        assertTrue(optionalComment.isPresent());
        assertEquals(comment, optionalComment.get());
    }

}
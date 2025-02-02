package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);
        Mockito.verify(out).outline();
    }

    @Test
    public void toStringReturnsOuterHtml() {
        String data = "test";
        Comment comment = new Comment(data);
        assert comment.toString().equals(comment.outerHtml()) : "Incorrect outer html for string representation of comment";
    }

    @Test
    public void cloneCreatesNewComment() {
        String data = "test";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assert !comment.equals(clonedComment) : "Comments should not be equal after cloning";
    }

    @Test
    public void isXmlDeclarationReturnsTrueWhenDataStartsWithExclamationOrQuestionMark() {
        String data = "test!";
        Comment comment = new Comment(data);
        assert comment.isXmlDeclaration() : "Incorrect result for isXmlDeclaration when data starts with !";
    }

    @Test
    public void asXmlDeclarationReturnsNullIfNotAnXmlDeclaration() {
        String data = "test";
        Comment comment = new Comment(data);
        assert comment.asXmlDeclaration() == null : "Should return null for not xml declaration";
    }

    @Test
    public void newCommentCreatesCorrectNode() {
        String data = "test data";
        Comment comment = new Comment(data);
        assert comment.value.equals(data) : "Incorrect data for new comment";
    }

    @Test
    public void cloneCreatesNewComment() {
        String data = "test";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        if (comment.equals(clonedComment)) {
            org.junit.Assert.fail("Comments should not be equal after cloning");
        }
    }

}
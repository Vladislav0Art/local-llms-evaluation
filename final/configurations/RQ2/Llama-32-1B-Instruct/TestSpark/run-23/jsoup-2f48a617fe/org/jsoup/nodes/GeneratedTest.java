package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean isXmlDeclaration() {
        return false;
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        return null;
    }

    @Override
    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // Empty implementation
    }

    @Override
    public String toString() {
        return data;
    }
}

public class CommentTest {

    @Test
    public void commentIsString() {
        Comment comment = new Comment("test");
        assertEquals(comment.toString(), "test");
    }

    @Test
    public void nodeName_returnsCommentName() {
        Comment comment = new Comment("test");
        assertEquals(comment.nodeName(), "comment");
    }

    @Test
    public void getData_returnsCommentData() {
        Comment comment = new Comment("test");
        assertEquals(comment.getData(), "test");
    }

    @Test
    public void setData_setsCommentData() {
        Comment comment = new Comment();
        comment.setData("new test data");
        assertEquals("new test data", comment.getData());
    }

    @Test
    public void outerHtmlHead_setsCommentsHtmlHead() throws IOException {
        String[] htmlHead = {"<html><head></head>", "<body></body>"};
        Comment comment = new Comment(htmlHead[0]);
        comment.outerHtmlHead(null, 1, null);
        assertEquals("<html><head><body></body></html>", comment.outerHtmlHead().toString());
    }

    @Test
    public void outerHtmlTail_setsCommentsHtmlTail() throws IOException {
        String[] htmlTail = {"<html><head></head>", "<body></body>"};
        Comment comment = new Comment(htmlTail[0]);
        comment.outerHtmlTail(null, 1, null);
        assertEquals("<html><head></head><body></body>", comment.outerHtmlTail().toString());
    }

    @Test
    public void toString_returnsCommentToString() {
        String commentData = "test";
        Comment comment = new Comment(commentData);
        assertEquals(comment.toString(), commentData);
    }

    @Test
    public void cloneCreatesClonesComment() throws IOException {
        String commentData = "new test data";
        Comment comment = new Comment(commentData);
        Comment clonedComment = comment.clone();
        assertEquals(commentData, clonedComment.getData());
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("<test>");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_setsCommentAsXmlDeclaration() throws IOException {
        String[] xmlDeclaration = {"<comment>", "</comment>"};
        Comment comment = new Comment(xmlDeclaration[0]);
        Comment asXmlComment = comment.asXmlDeclaration();
        assertEquals("<comment></comment>", asXmlComment.toString());
    }

}
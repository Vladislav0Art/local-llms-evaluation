package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParserSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newNode_CreatedWithCorrectData() {
        Comment comment = new Comment("some data");
        Mockito.when(comment.getData()).thenReturn("some data");
        assert comment.getData().equals("some data");
    }

    @Test
    public void nodeName_ReturnsNodeName() {
        Comment comment = new Comment("some data");
        comment.nodeName();
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void getData_ReturnsCorrectData() {
        Comment comment = new Comment("some data");
        String data = comment.getData();
        assert data.equals("some data");
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void setData_SetsCorrectData() {
        Comment comment = new Comment("some old data");
        comment.setData("new data");
        String data = comment.getData();
        assert data.equals("new data");
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void outerHtmlHead_DoesNotThrowAnyExceptions() throws IOException {
        Appendable accum = new StringBuilder(); // mock implementation for append
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("some data");
        comment.outerHtmlHead(accum, depth, out);
        assert !Mockito.anyError().isThrownBy(() -> comment.outerHtmlHead(accum, depth, out));
    }

    @Test
    public void outerHtmlTail_DoesNotThrowAnyExceptions() {
        Appendable accum = new StringBuilder(); // mock implementation for append
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("some data");
        comment.outerHtmlTail(accum, depth, out);
        assert !Mockito.anyError().isThrownBy(() -> comment.outerHtmlTail(accum, depth, out));
    }

    @Test
    public void toString_ReturnsCorrectString() {
        Comment comment = new Comment("some data");
        String toString = comment.toString();
        assert toString.equals(comment.getData());
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void clone_ReturnsSameObjectIfNotModified() {
        Comment comment = new Comment("some data");
        Comment clonedComment = comment.clone();
        assert clonedComment == comment;
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void isXmlDeclaration_ReturnsCorrectBooleanValue() {
        Comment comment = new Comment("some data");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assert !isXmlDeclaration;
        Mockito.verifyNoMethodCalls();
    }

    @Test
    public void asXmlDeclaration_ReturnsNullIfNotXmlDeclaration() {
        Comment comment = new Comment("some data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assert xmlDeclaration == null;
        Mockito.verifyNoMethodCalls();
    }

}
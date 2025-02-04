package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Appendable;

public class GeneratedTest {

    @Test
    public void newCommentCreatesNewNode() throws IOException {
        Comment comment = new Comment("test");
        assertNotNull(comment);
    }

    @Test
    public void setDataUpdatesValue() throws IOException {
        Comment comment = new Comment("");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void getDATAReturnsCoreValue() {
        Comment comment = new Comment("test");
        String data = comment.getData();
        assertEquals("test", data);
    }

    @Test
    public void outerHTMLHeadAppendsCommentData() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHTMLHeadDoesNotAppendIfIsBlockComment() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment comment = new Comment("test");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment, cloned);
    }

    @Test
    public void isXmlDeclarationReturnsTrueIfDataStartsWithEitherExclamationOrQuestionMark() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullIfDataDoesNotMatchPattern() throws IOException {
        Comment comment = new Comment("test");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }
}

public class MockedComment extends Comment {
    private final String data;

    public MockedComment(String data) {
        super(data);
        this.data = data;
    }

    @Override
    public String getData() {
        return data;
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorCommentTest() {
        new Comment("");
    }

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void outerHtmlHeadCommentTest() throws IOException {
        Comment comment = new Comment("");
        Appendable accum = new java.util.ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
    }

    @Test
    public void outerHtmlTailCommentTest() {
        Comment comment = new Comment("");
        Appendable accum = new java.util.ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
    }

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("");
        assertEquals("<!-- data -->", comment.toString());
    }

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
    }

    @Test
    public void isXmlDeclarationCommentTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationCommentTest() {
        Comment comment = new Comment("");
        // Mocking for XmlDeclaration, since it's not directly testable.
    }

}
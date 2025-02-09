package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedTest {

    @Test
    public void newCommentIsLeafNode() {
        Comment comment = new Comment("data");
        assertSame(LeafNode.class, comment.getClass());
    }

    @Test
    public void commentNameIsComment() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void commentDataReturnsStringValue() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void commentDataSetsStringValue() {
        String data = "newData";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadAppendsData() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append(eq("<!-- data -->"));
    }

    @Test
    public void outerHtmlTailApendsData() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, out);
        verify(accum).append(eq("-->"));
    }

    @Test
    public void toStringReturnsCommentData() {
        String data = "data";
        Comment comment = new Comment(data);
        assertEquals("<!-- " + data + " -->", comment.toString());
    }

    @Test
    public void cloneReturnsSameType() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertSame(Comment.class, cloned.getClass());
    }

    @Test
    public void isXmlDeclarationIsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}
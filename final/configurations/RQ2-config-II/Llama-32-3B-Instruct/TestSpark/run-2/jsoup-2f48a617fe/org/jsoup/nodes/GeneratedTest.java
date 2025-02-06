package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void newCommentIsEmpty() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void newCommentHasData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDATAUpdatesData() {
        Comment comment = new Comment("oldData");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void isXMLDeclarationReturnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXMLDeclarationReturnsNull() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment original = new Comment("data");
        Comment cloned = original.clone();
        assertNotNull(cloned);
        assertNotSame(original, cloned);
    }

    @Test
    public void outerHtmlHeadIncludesTextContent() throws IOException {
        when(accum.append(anyString())).thenReturn(accum);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!-- data -->", accum.toString());
    }

    @Test
    public void outerHtmlTailDoesNotIncludeTextContent() throws IOException {
        when(accum.append(anyString())).thenReturn(accum);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringIncludesDataAndComments() {
        Comment comment = new Comment("<!-- data -->");
        String expectedOutput = "<!-- data -->";
        assertEquals(expectedOutput, comment.toString());
    }

}
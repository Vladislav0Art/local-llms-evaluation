package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void testConstructor() {
        Comment comment = new Comment("Hello, world!");
        assertEquals("Hello, world!", comment.getData());
    }

    @Test
    public void testDataGetter() {
        Comment comment = new Comment("This is a comment.");
        assertEquals("This is a comment.", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("Initial data");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() {
        when(out.prettyPrint()).thenReturn(true);
        when(accum.append(any())).thenReturn(accum);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--comment-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        assertNull(accum.toString());
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("Hello, world!");
        assertEquals("<!--Hello, world!-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment comment = new Comment("Initial data");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("<xml:tag/>");
        assertTrue(comment.isXmlDeclaration());

        Comment comment2 = new Comment("<!xml:tag>");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("Not an XML Declaration");
        assertFalse(comment3.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("<xml:tag/>");
        assertNull(comment.asXmlDeclaration());

        Comment comment2 = new Comment("<!xml:tag>");
        XmlDeclaration decl = comment2.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationEmptyData() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}
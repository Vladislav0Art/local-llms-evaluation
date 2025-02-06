package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Test
    public void nodeName() {
        when(accum instanceof Applicable).thenReturn(true);
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setData() {
        Comment comment = new Comment("data");
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHead() {
        when(accum.append()).thenReturn(true);
        Comment comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        assertNotNull(accum.toString());
    }

    @Test
    public void outerHtmlTail() {
        when(accum.append()).thenReturn(true);
        Comment comment = new Comment("data");
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        assertNotNull(accum.toString());
    }

    @Test
    public void toString() {
        Comment comment = new Comment("data");
        String expected = "<!-- data -->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void clone() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclaration() {
        when(accum instanceof Applicable).thenReturn(true);
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("<!-- data -->");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertNotNull(xmlDecl);
        assertEquals("<!-- data -->", xmlDecl.toString());
    }

}
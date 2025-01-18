package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void CommentInitializationTest() {
        Comment comment = new Comment("Test data");
        assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test data");
        assertEquals("Test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test data");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlHead(appendable, 0, outputSettings);
        Mockito.verify(appendable).append("<!--Test data-->");
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test data");
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(appendable, 0, outputSettings);
        assertNotNull(appendable);
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test data");
        String result = comment.toString();
        assertTrue(result.contains("<!--Test data-->"));
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloned = comment.clone();
        assertEquals(cloned.getData(), comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test data");
        assertNull(comment.asXmlDeclaration());
    }

}
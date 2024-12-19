package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newCommentTest() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
        assertTrue(comment.equals(comment));
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclaration());

        Comment comment2 = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment2.isXmlDeclaration());

        Comment comment3 = new Comment("not xml");
        assertFalse(comment3.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertNull(comment.asXmlDeclaration());

        Comment comment2 = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration decl = comment2.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable out = outContent;
        Document.OutputSettings outSettings = new Document.OutputSettings(true, true);

        Comment comment = new Comment("test data");
        comment.outerHtmlHead(out, 0, outSettings);
        String expectedOutput = "<!--test data-->";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Appendable out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings(false, true);

        Comment comment = new Comment("");
        comment.outerHtmlHead(out, 0, outSettings);
        String expectedOutput = "";
        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void outerHtmlTest() throws IOException {
        Appendable out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings(true, true);

        Comment comment = new Comment("test data");
        comment.outerHtml(out, 0, outSettings);
        String expectedOutput = "<!--test data-->";
        assertEquals(expectedOutput, out.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        assertSame(comment1, comment2);
    }

}
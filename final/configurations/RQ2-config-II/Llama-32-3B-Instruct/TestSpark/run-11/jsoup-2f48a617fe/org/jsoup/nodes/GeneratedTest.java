package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void commentConstructorTest() {
        String data = "Comment data";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Data");
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void getDataSetTest() {
        Comment comment = new Comment("Initial data");
        String newData = "New data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;

        Comment comment = new Comment("Comment data");
        comment.outerHtmlHead(accum, depth, out);

        assertEquals("<!-- Comment: comment data -->", outContent.toString());
    }

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;

        Comment comment = new Comment("Comment data");
        comment.outerHtmlTail(accum, depth, out);

        assertEquals("\n<!-- Comment: comment data -->", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Data");
        String expectedOutput = "<!-- Data -->";
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Initial data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<data>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("<data>", xmlDeclaration.getData());
    }

}
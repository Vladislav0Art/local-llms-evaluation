package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedTest {

    public void outerHtmlHead(Comment comment, Appendable accum, int depth, Document.OutputSettings out) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        comment.outerHtmlHead(bos, depth, out);
        assertEquals("<!--", bos.toString().trim());
    }

    public void outerHtmlTail(Comment comment, Appendable accum, int depth, Document.OutputSettings out) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        comment.outerHtmlTail(bos, depth, out);
        assertEquals("-->", bos.toString().trim());
    }

    @Test
    public void constructor_hasCorrectData() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

    @Test
    public void nodeName_isComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void setData_setsCorrectData() {
        Comment comment = new Comment("");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void toString_returnsCorrectString() {
        Comment comment = new Comment("");
        assertEquals("<!-- -->", comment.toString());
    }

    @Test
    public void clone_returnsCorrectComment() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        assertNotNull(comment2);
        assertEquals(comment1, comment2);
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsNullWhenNotDeclaration() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}
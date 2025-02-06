package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void constructor_commentWithData() {
        // [Constructor][NoData]Test
        Comment comment = new Comment("Some Data");
        assertNotNull(comment);
        assertEquals("Comment", comment.nodeName());
        assertEquals("Some Data", comment.getData());
    }

    @Test
    public void nodeName_isCorrect() {
        // [MethodUnderTest][IsCorrectNodeName]Test
        Comment comment = new Comment("Some Data");
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void getData_emptyString() {
        // [Data][EmptyString]Test
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void setData_newData() {
        // [MethodUnderTest][NewData]Test
        Comment comment = new Comment("Old Data");
        String newData = "New Data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHead_notUsed() {
        // [MethodUnderTest][NotUsed]Test
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("Some Data");
        comment.outerHtmlHead(accum, 0, out);
        assertNull(accum.toString());
    }

    @Test
    public void outerHtmlTail_used() {
        // [MethodUnderTest][Used]Test
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("Some Data");
        comment.outerHtmlTail(accum, 0, out);
        assertNotNull(accum.toString());
    }

    @Test
    public void toString_correctOutput() {
        // [MethodUnderTest][CorrectString]Test
        Comment comment = new Comment("Some Data");
        String expectedOutput = "<!-- Some Data -->";
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void clone_newComment() {
        // [MethodUnderTest][NewComment]Test
        Comment originalComment = new Comment("Some Data");
        Comment clonedComment = originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment.nodeName(), clonedComment.nodeName());
    }

    @Test
    public void isXmlDeclaration_true() {
        // [MethodUnderTest][IsTrue]Test
        Comment comment = new Comment("<xml>Some Data</xml>");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_nullReturns() {
        // [MethodUnderTest][NullReturns]Test
        Comment comment = new Comment("Some Data");
        assertNull(comment.asXmlDeclaration());
    }

}
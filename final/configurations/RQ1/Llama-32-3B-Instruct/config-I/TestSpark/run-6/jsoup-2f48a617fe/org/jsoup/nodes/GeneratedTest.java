package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createComment_Test() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment);
    }

    @Test
    public void nodeName_Test() {
        Comment comment = new Comment("Hello World");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getData_Test() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void setData_Test() {
        Comment comment = new Comment("Hello World");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHead_Test() throws IOException {
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(accum, 0, out);
        assertTrue(accum.toString().contains("<!--"));
        accum.clear();
    }

    @Test
    public void outerHtmlTail_Test() throws IOException {
        Comment comment = new Comment("Hello World");
        comment.outerHtmlTail(accum, 0, out);
        assertTrue(accum.toString().isEmpty());
    }

    @Test
    public void toString_Test() throws IOException {
        Comment comment = new Comment("Hello World");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<html><body>Hello World</body></html>", "");
        Element el = doc.body().child(0);
        documentBuilder.setDocument(doc);
        elementBuilder.clearChildren(el);
        comment.outerHtml(bos, out);
        assertTrue(bos.toString().contains("<!--Hello World-->"));
    }

    @Test
    public void clone_Test() {
        Comment comment = new Comment("Hello World");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.value, clonedComment.value);
    }

    @Test
    public void isXmlDeclaration_Test() {
        Comment comment1 = new Comment("Hello World!");
        assertTrue(comment1.isXmlDeclaration());
        Comment comment2 = new Comment("Hello World?");
        assertTrue(comment2.isXmlDeclaration());
        Comment comment3 = new Comment("Hello World");
        assertFalse(comment3.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_Test() {
        Comment comment1 = new Comment("Hello World!");
        assertNull(comment1.asXmlDeclaration());
        Comment comment2 = new Comment("Hello World?");
        assertNotNull(comment2.asXmlDeclaration());
        assertEquals(new XmlDeclaration("#comment", true), comment2.asXmlDeclaration());
        Comment comment3 = new Comment("Hello World");
        assertNull(comment3.asXmlDeclaration());
    }

}
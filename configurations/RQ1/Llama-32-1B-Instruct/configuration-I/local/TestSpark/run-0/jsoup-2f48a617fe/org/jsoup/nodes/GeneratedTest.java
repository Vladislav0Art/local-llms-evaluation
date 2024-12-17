package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @BeforeEach
    void setup() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("");
        Assert.assertTrue(comment.outerHtmlHead(ParseSettings.defaultParser(), 0, null).contains("<!--#comment-->"));
        Assert.assertFalse(comment.outerHtmlHead(ParseSettings.defaultParser(), 1, null).contains(""));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Comment comment = new Comment("");
        Assert.assertFalse(comment.outerHtmlTail(ParseSettings.defaultParser(), 0, null).contains("<!----"));
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("test");
        String result = comment.toString();
        assertEquals("<!--#comment-->test", result);
    }

    @Test
    public void testClone() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        Assert.assertNotSame(comment1, comment2);
        Assert.assertNotNull(comment2);
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("<!test>");
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() throws IOException {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
    }

}
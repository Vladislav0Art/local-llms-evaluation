package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        Comment updatedComment = comment.setData("updatedTest");
        assertEquals("updatedTest", updatedComment.getData());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
    }

    @Test
    public void isXmlDeclarationTest_True() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTest_False() {
        Comment comment = new Comment("Not a XML Declaration");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest_Null() {
        Comment comment = new Comment("!Not a XML Declaration");
        assertEquals(null, comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest_NotNull() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Element.OffsetSettings element = Mockito.mock(Element.OffsetSettings.class);

        comment.outerHtmlHead(outputSettings, element, 1);
        assertEquals("<!--test-->", outputSettings.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Element.OffsetSettings element = Mockito.mock(Element.OffsetSettings.class);

        comment.outerHtmlTail(outputSettings, element, 1);
        assertEquals("", outputSettings.toString());
    }

}
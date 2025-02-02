package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    @Mock
    private OutputSettings outputSettings;

    public static void indent(Appendable accum, int depth, OutputSettings out) {
        // dummy implementation for mocking purposes only
    }

    @Test
    public void createCommentWithData_test() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("data", comment.getData());
    }

    @Test
    public void outerHtmlHead_withPrettyPrint_true_andBlockTag_test() {
        when(outputSettings.prettyPrint()).thenReturn(true);
        when(outputSettings.formatAsBlock()).thenReturn(true);
        Comment comment = new Comment("");
        comment.setNodeName("#comment");
        comment.outerHtmlHead(appendable, 0, outputSettings);
        assertTrue(appendable.toString().contains("<!--data-->"));
    }

    @Test
    public void outerHtmlHead_withoutPrettyPrint_andOutline_true_test() {
        when(outputSettings.prettyPrint()).thenReturn(false);
        when(outputSettings.outline()).thenReturn(true);
        Comment comment = new Comment("");
        comment.setNodeName("#comment");
        comment.outerHtmlHead(appendable, 0, outputSettings);
        assertTrue(appendable.toString().contains("<!--data-->"));
    }

    @Test
    public void outerHtmlTail_withoutAnyContent_test() {
        Comment comment = new Comment("");
        comment.setNodeName("#comment");
        comment.outerHtmlTail(appendable, 0, outputSettings);
        assertEquals("", appendable.toString());
    }

    @Test
    public void cloneComment_test() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertTrue(comment.equals(clonedComment));
    }

    @Test
    public void isXmlDeclaration_withDeclarationData_test() {
        Comment comment = new Comment("declaration data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_withoutDeclarationData_test() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_withValidContent_test() throws Exception {
        when(document.body().children()).thenReturn(new Element[]{});
        Comment comment = new Comment("declaration data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.getData().equals(comment.getData()));
    }

    @Test
    public void asXmlDeclaration_withoutValidContent_test() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}
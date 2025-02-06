package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Element parent;

    @Test
    public void constructor_TestsInitializedCorrectly() {
        new Comment("Test Data");
    }

    @Test
    public void nodeName_TestsCorrectNodeName() {
        Comment comment = new Comment("Test Data");
        assertEquals("COMMENT", comment.nodeName());
    }

    @Test
    public void getData_TestsCorrectData() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

    @Test
    public void setData_TestsCorrectDataUpdate() {
        Comment comment = new Comment("Initial Test Data");
        comment.setData("Updated Data");
        assertEquals("Updated Data", comment.getData());
    }

    @Test
    public void outerHtmlHead_TestsOutputCorrectlyWithAccum() throws IOException {
        Document document = new Document();
        Comment comment = new Comment("<script>alert('Hello World!');</script>");
        comment.outerHtmlHead(accum, 0, document.OutputSettings.getDefaultSettings());
        assertEquals("<script> alert('Hello World!'); </script>", accum.toString());
    }

    @Test
    public void outerHtmlTail_TestsOutputCorrectlyWithAccum() {
        Document document = new Document();
        Comment comment = new Comment("<p>Hello World!</p>");
        comment.outerHtmlTail(accum, 0, document.OutputSettings.getDefaultSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void toString_TestsToStringValue() {
        Comment comment = new Comment("Test Data");
        assertEquals("<!-- Test Data -->", comment.toString());
    }

    @Test
    public void clone_TestsCorrectCloneMethod() {
        Comment comment = new Comment("Test Data");
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertTrue(clone.isEqualNode(comment));
    }

    @Test
    public void isXmlDeclaration_TestsIsXmlDeclarationFalse() {
        Comment comment = new Comment("<script>alert('Hello World!');</script>");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_TestsAsXmlDeclarationNotNullWhenIsXmlDeclarationTrue() {
        Comment comment = new Comment("<xml><data>Hello World!</data></xml>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}
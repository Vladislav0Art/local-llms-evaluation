package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Document.OutputSettings.LAX;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private DocumentOutputSettings out;

    @Test
    public void newNodeData_isNull_getData() {
        Comment comment = new Comment(null);
        assertEquals(null, comment.getData());
    }

    @Test
    public void newNodeData_notNull_getData() {
        Comment comment = new Comment("Hello");
        assertEquals("Hello", comment.getData());
    }

    @Test
    public void clone_isSameComment_clone() {
        Comment comment1 = new Comment("Hello");
        Comment comment2 = comment1.clone();
        assertSame(comment1, comment2);
    }

    @Test
    public void isXmlDeclaration_returnsFalse_xmlDeclaration() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_isNull_asXmlDeclaration() {
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        Comment comment = new Comment(xmlDeclaration.toString());
        assertEquals(xmlDeclaration, comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHead_noContent_emptyString_appendableDepthDocumentOutputSettings() throws IOException {
        Comment comment = new Comment("");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(Matcher.anyString());
    }

    @Test
    public void outerHtmlHead_content_notEmpty_string_appendableDepthDocumentOutputSettings() throws IOException {
        Comment comment = new Comment("Hello");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(comment.getData());
    }

    @Test
    public void outerHtmlTail_emptyString_appendableDepthDocumentOutputSettings() {
        Comment comment = new Comment("");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(comment.getData());
    }

    @Test
    public void outerHtmlTail_contentNotEmpty_string_appendableDepthDocumentOutputSettings() {
        Comment comment = new Comment("Hello");
        appendable(accum, 1, out);
        Mockito.verify(out).append(Matcher.anyString(), 0, LAX);
        Mockito.verify(accum).append(comment.getData());
    }

    private void appendable(Appendable accum, int depth, DocumentOutputSettings out) throws IOException {
        out.append("<div>", 0, LAX);
        accum.append("<div>");
        accum.append(out.toString(), 1, LAX);
        out.append("</div>", 0, LAX);
        accum.append("</div>");
    }

    @Test
    public void toString_emptyString_toString() {
        Comment comment = new Comment("");
        assertEquals("", comment.toString());
    }

    @Test
    public void toString_notEmpty_string_toString() {
        Comment comment = new Comment("Hello");
        assertEquals("Hello", comment.toString());
    }

}
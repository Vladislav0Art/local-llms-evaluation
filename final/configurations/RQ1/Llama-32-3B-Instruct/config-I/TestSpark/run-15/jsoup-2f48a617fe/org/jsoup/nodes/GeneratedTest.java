package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTest {

    @Test
    public void constructor_CreatesCommentNode() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
    }

    @Test
    public void outerHtmlHead_SetsCorrectStringForEmptyDocument() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTail_SetsEmptyStringForEmptyDocument() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtml_SetsCorrectString() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("This is a comment");
        comment.outerHtml(accum, depth, out);
        assertEquals("<!--This is a comment-->", accum.toString());
    }

    @Test
    public void clone_ReturnsSameObject() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("This is not an XML declaration");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsNullForInvalidData() {
        Comment comment = new Comment("!");
        assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsXmlDeclarationForValidData() throws Exception {
        Document document = null;
        Parser parser = new Parser(true);
        String htmlString = "<!DOCTYPE PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html><body><!--This is a comment--></body></html>";
        document = Document.parse(htmlString, parser);
        Comment comment = new Comment("!");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}
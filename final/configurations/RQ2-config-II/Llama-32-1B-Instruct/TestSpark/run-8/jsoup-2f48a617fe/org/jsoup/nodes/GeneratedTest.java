package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    public Comment(String data) { /* implementation */ }

    public String nodeName() {
        return "Comment";
    }

    public String getData() {
        return null;
    }

    public Comment setData(String data) {
        return this;
    }

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        if (depth > 0) {
            out.append("<!--");
            for (String line : getLines()) {
                out.append(line).append("\n");
            }
            out.append("-->");
        } else {
            out.append("<!--");
            out.append("<!--");
            for (String line : getLines()) {
                out.append(line).append("\n");
            }
            out.append("-->");
        }
    }

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
    }

    @Override
    public String toString() {
        List<String> lines = new ArrayList<>();
        lines.add("<Comment>");
        if (getData() != null) {
            lines.add(getData());
        }
        for (String line : getLines()) {
            lines.add(line);
        }
        lines.add("</Comment>");
        return String.join("\n", lines);
    }

    @Override
    public Comment clone() {
        return this;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        List<String> lines = new ArrayList<>();
        lines.add("<!--xml declaration-->");
        for (String line : getLines()) {
            lines.add(line);
        }
        lines.add("</xml declaration>");
        if (!lines.isEmpty()) {
            return new XmlDeclaration(lines.get(0));
        } else {
            return null;
        }
    }

    public String getData() {
        return null;
    }
}

public class CommentTest {

    @Test
    public void should_add_comment_to_html_head() throws IOException {
        String data = "Hello World!";
        Comment comment = new Comment(data);
        appendToHtmlHead(comment, "example");
        assertCommentIsInHtmlHead(comment);
    }

    @Test
    public void should_add_xml_declaration_to_comment() throws IOException {
        String data = "Hello World!";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        appendToOutputSettings(xmlDeclaration);
        assertXmlDeclarationInOutputSettings(xmlDeclaration);
    }

    private void appendToHtmlHead(Comment comment, String expectedString) throws IOException {
        Document doc = new Document();
        comment.outerHtmlHead(doc, 0, null);
        Appendable output = new StringWriter();
        doc.output(output);
        assertEquals(expectedString, output.toString());
    }

    private void assertCommentIsInHtmlHead(Comment comment) {
        Document doc = new Document();
        appendToHtmlHead(comment, "<!--example-->");
        Comment actualComment = doc.getComments()[0];
        assertTrue(actualComment.isXmlDeclaration(), "Expected comment is XML declaration");
        assertFalse(actualComment.isComment(), "Expected not to be a comment");
    }

    private void appendToOutputSettings(XmlDeclaration xmlDeclaration) {
        Document doc = new Document();
        appendToHtmlHead(xmlDeclaration, "");
        Appendable output = new StringWriter();
        doc.output(output);
        assertEquals("<!--xml declaration-->", output.toString());
    }

    private void assertXmlDeclarationInOutputSettings(XmlDeclaration xmlDeclaration) {
        Document doc = new Document();
        appendToHtmlHead(xmlDeclaration.asXmlDeclaration(), "");
        Appendable output = new StringWriter();
        doc.output(output);
        assertEquals("<!--xml declaration-->", output.toString());
    }

}
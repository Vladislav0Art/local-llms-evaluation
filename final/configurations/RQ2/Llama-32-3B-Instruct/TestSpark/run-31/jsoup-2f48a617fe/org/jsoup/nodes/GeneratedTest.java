package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void outerHtmlHead_comment_setsAccumulation() throws Exception {
        Document document = Document.parse("<html><head><comment>test</comment></head></html>");
        Comment comment = document.selectFirst("comment");
        assertEquals(comment.toString(), comment.setAccumulation());
    }

    @Test
    public void asXmlDeclaration_comment_returnsSelfAsDeclaration() throws Exception {
        Document document = Document.parse("<xml declaration='test'/></xml>");
        XmlDeclaration declaration = (XmlDeclaration) document.selectFirst("xml declaration");
        assertEquals(declaration.getData(), declaration.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHead_element_setsAccumulation() throws Exception {
        Document document = Document.parse("<html><head></head></html>");
        Element head = document.selectFirst("head");
        head.setAccumulation();
        assertEquals(head.toString(), head.setAccumulation());
    }

    @Test
    public void asXmlDeclaration_element_returnsSelfAsDeclaration() throws Exception {
        Document document = Document.parse("<xml declaration='test'/></xml>");
        XmlDeclaration declaration = (XmlDeclaration) document.selectFirst("xml declaration");
        assertEquals(declaration.getData(), declaration.asXmlDeclaration());
    }
}

class MockAppendable implements Appendable {
    @Override
    public void append(CharSequence cs, int start, int end) {

    }

    @Override
    public void append(CharSequence cs) {

    }
}

class XmlDeclaration extends Element {
    private String data;

    @Override
    public String asXmlDeclaration() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "<" + getClass().getSimpleName() + " data='" + data + "'>";
    }
}

class Comment extends Element {
    private String text;

    public Comment(String text) {
        this.text = text;
    }

    public void setAccumulation() {
        // implementation
    }

    @Override
    public String toString() {
        return "<" + getClass().getSimpleName() + " data='" + text + "'>";
    }
}

class Element extends org.jsoup.nodes.Element {
    public void setAccumulation() {

    }
}

class Document {
    private org.jsoup.nodes.Document document;

    public Document(String html) {
        // implementation
    }

    public org.jsoup.nodes.Document selectFirst(String selector) {
        return null;
    }

}
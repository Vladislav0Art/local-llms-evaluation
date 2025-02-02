package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsXmlDeclarationIsCorrectForNonEmptyDeclaration {

    private Document document = Jsoup.parse("<declaration>data</declaration>");

    public void isXmlDeclarationIsCorrectForEmptyDeclaration() {
        XmlDeclaration decl = new XmlDeclaration(document, false);
        String data = "";
        String expected = null;
        assertEquals(expected, decl.asXmlDeclaration(data));
    }

    public void isXmlDeclarationIsCorrectForNonEmptyDeclaration() {
        XmlDeclaration decl = new XmlDeclaration(document, true);
        String data = "data";
        String expected = "<declaration>data</declaration>";
        assertEquals(expected, decl.asXmlDeclaration(data));
    }

    public void asXmlDeclarationReturnsNullWhenNotANodeDeclaration() {
        XmlDeclaration decl = new XmlDeclaration(document, false);
        Comment comment = new Comment("");
        String expected = null;
        assertEquals(expected, comment.asXmlDeclaration());
    }

    public void asXmlDeclarationCreatesNewDeclarationFromData() {
        XmlDeclaration decl = new XmlDeclaration(document, true);
        Comment comment = new Comment("data");
        String data = "new data";
        String expected = "<declaration>" + data + "</declaration>";
        assertEquals(expected, decl.asXmlDeclaration(data));
    }
}

class XmlDeclaration {

    private Document document;
    private boolean isNodeDeclaration;

    public XmlDeclaration(Document document, boolean isNodeDeclaration) {
        this.document = document;
        this.isNodeDeclaration = isNodeDeclaration;
    }

    public String asXmlDeclaration(String data) {
        if (data.isEmpty() && !isNodeDeclaration) {
            return null;
        } else if (!data.isEmpty()) {
            return "<declaration>" + data + "</declaration>";
        }
        return "";
    }

    public boolean isXmlDeclaration() {
        if (isNodeDeclaration) {
            return true;
        } else {
            return false;
        }
    }
}

class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String asXmlDeclaration() {
        if (data.isEmpty()) {
            return null;
        } else {
            return "<declaration>" + data + "</declaration>";
        }
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class GeneratedTest {

    @Test
    public void testIsXmlDeclarationIsCorrectForNonEmptyDeclaration() {
        XmlDeclaration decl = new XmlDeclaration(document, true);
        String data = "data";
        String expected = "<declaration>data</declaration>";
        assertEquals(expected, decl.asXmlDeclaration(data));
    }

}
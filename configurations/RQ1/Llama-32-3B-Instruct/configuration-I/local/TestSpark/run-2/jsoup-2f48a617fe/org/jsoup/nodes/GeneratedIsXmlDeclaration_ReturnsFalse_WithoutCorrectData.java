package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_ReturnsFalse_WithoutCorrectData {

    @Test
    public void isXmlDeclaration_ReturnsFalse_WithoutCorrectData() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }
}

class Document {
    private List Element>children;

    public Element appendElement(String name) {
        Element element = new Element(this, name);
        return element;
    }

    public void appendChild(Element child) {
        children.add(child);
    }
}

class Appendable implements Appendable {
    @Override
    public void append(String s) {
        // implementation of append method
    }

    @Override
    public void append(char c) {
        // implementation of append method
    }

    @Override
    public String toString() {
        // implementation of toString method
    }
}

class Element {
    private Document document;
    private String name;

    public Element(Document document, String name) {
        this.document = document;
        this.name = name;
    }

    public void appendChild(Element child) {
        // implementation of appendChild method
    }

    @Override
    public String toString() {
        return name;
    }
}

class Document.

OutputSettings {
    private boolean prettyPrint;
    private boolean outline;

    @Override
    public boolean out ()
		throws IOException {
        return outline;
    }

}
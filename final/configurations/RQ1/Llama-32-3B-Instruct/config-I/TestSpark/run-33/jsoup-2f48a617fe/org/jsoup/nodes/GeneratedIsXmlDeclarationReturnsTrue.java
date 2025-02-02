package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedIsXmlDeclarationReturnsTrue {

    @Test
    public void isXmlDeclarationReturnsTrue() {
        Comment comment = new Comment();
        comment.setText("<!-- XML declaration -->");
        assertTrue(comment.isXmlDeclaration(""));
    }
}

public class Document {
    private Element root;

    public Document() {
        this.root = new Element("html");
    }

    public void appendChild(Element element) {
        // implementation
    }

    public String toString() {
        // implementation
    }
}

public class Comment {
    private boolean block;
    private String text;

    public void setBlock(boolean block) {
        this.block = block;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String outerHtml() {
        return "<!-- " + text + "-->";
    }

    public String outerHtmlWithoutWrap() {
        // implementation
    }
}

public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public void appendChild(Element element) {
        // implementation
    }

    public boolean containsElement(String name) {
        return true; // implementation
    }

}
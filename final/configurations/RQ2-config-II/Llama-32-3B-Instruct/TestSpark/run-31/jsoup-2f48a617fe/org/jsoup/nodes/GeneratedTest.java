package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private final Document doc = new Document();

    @Test
    public void dataNullIsXmlDeclarationTest() {
        Comment comment = new Comment(null);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void dataEmptyStringIsXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void dataXmlDeclarationIsXmlDeclarationTest() throws IOException {
        String xmlDeclaration = "<?xml version=\"1.0\"?><!DOCTYPE html>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void dataStringIsXmlDeclarationTest() throws IOException {
        String xmlDeclaration = "<xmlData>Hello</xmlData>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void cloneNullResultTest() {
        Comment comment = new Comment(null);
        assertNull(comment.clone());
    }

    @Test
    public void dataEmptyStringCloneTest() {
        String data = "";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertEquals(0, cloned.getData().length());
    }

    @Test
    public void cloneResultEqualsOriginalTest() throws IOException {
        String data = "<data>Hello</data>";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertEquals(data, cloned.getData());
    }

    @Test
    public void asXmlDeclarationNullResultTest() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void dataEmptyStringAsXmlDeclarationTest() throws IOException {
        String data = "";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertTrue(xmlDeclaration == null || xmlDeclaration.getData().isEmpty());
    }

    @Test
    public void dataXmlDeclarationAsXmlDeclarationTest() throws IOException {
        String data = "<data>Hello</data>";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(0, xmlDeclaration.getData().length());
    }
}

class Document {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public @Nullable XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

class Appendable {

}

class LeafNode {
    // Empty implementation
}

class OuterHtmlContext {
    // Empty implementation
}

class Document.

OutputSettings {
    // Empty implementation
}

class Appendable implements Appendable {
    // Empty implementation
}

interface ParseSettings {
}

}
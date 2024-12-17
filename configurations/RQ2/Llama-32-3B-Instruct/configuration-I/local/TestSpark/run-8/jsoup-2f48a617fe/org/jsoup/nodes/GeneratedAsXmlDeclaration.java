package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.data().equals(""));
    }
}

class Appendable extends java.io.Writer {

    private StringBuilder builder;

    public Appendable() {
        this.builder = new StringBuilder();
    }

    @Override
    public void write(char[] c, int i, int j) throws IOException {
        builder.append(c, i, j);
    }

    @Override
    public void append(char c) throws IOException {
        builder.append(c);
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedAppendToCommentAsXmlDeclarationReturnsNull {

    @Test
    public void appendToCommentAsXmlDeclarationReturnsNull() {
        XmlDeclaration xmlDeclaration = new XmlDeclaration();
        Comment comment = new Comment("some data");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNull(result);
    }

}
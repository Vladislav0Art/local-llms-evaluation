package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationMethod_ReturnsNullWhenCannotBeParsedAsDeclarationTest {

    @Test
    public void asXmlDeclarationMethod_ReturnsNullWhenCannotBeParsedAsDeclarationTest() {
        Comment comment = new Comment("This is a test");
        assertNull(comment.asXmlDeclaration());
    }

}
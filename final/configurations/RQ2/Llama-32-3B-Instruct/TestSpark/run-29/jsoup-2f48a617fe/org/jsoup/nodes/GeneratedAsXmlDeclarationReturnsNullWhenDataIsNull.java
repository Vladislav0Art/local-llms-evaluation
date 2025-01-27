package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsXmlDeclarationReturnsNullWhenDataIsNull {

    @Test
    public void asXmlDeclarationReturnsNullWhenDataIsNull() {
        Comment comment = new Comment(null);
        assertNull(comment.asXmlDeclaration());
    }

}
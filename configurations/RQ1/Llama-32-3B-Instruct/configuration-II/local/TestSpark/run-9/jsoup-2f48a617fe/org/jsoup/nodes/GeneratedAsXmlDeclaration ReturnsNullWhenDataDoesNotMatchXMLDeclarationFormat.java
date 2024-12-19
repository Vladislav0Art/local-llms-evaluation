package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclaration ReturnsNullWhenDataDoesNotMatchXMLDeclarationFormat {

    @Test
    public void asXmlDeclaration

    ReturnsNullWhenDataDoesNotMatchXMLDeclarationFormat() throws IOException {
        Comment comment = new Comment("<!-- Some data -->");
        assertNull(comment.asXmlDeclaration());
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationReturnsNullWhenNotAnXMLDeclaration {

    @Test
    public void asXmlDeclarationReturnsNullWhenNotAnXMLDeclaration() {
        Comment comment = new Comment("test");
        assertNull(comment.asXmlDeclaration());
    }

}
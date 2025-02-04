package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationReturnsXmlDeclarationWhenIsXmlDeclaration {

    @Test
    public void asXmlDeclarationReturnsXmlDeclarationWhenIsXmlDeclaration() {
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><test></test>";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.getData().equals(data));
    }

}
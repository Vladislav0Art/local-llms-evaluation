package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAsXmlDeclarationTest2 {

    @Test
    public void asXmlDeclarationTest2() {
        Comment comment = new Comment("This is not an XML Declaration");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}
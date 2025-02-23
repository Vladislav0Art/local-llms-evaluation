package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!hello");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("hello", xmlDeclaration.getData());
    }

}
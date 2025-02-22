package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("This is a comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals(null, decl);
    }

}
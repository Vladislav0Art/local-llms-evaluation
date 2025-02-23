package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("data", xmlDeclaration.name());
    }

}
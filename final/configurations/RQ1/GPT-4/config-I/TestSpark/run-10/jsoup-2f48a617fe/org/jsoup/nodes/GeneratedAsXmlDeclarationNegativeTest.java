package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationNegativeTest {

    @Test
    public void asXmlDeclarationNegativeTest() {
        Comment comment = new Comment("Not XML comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}